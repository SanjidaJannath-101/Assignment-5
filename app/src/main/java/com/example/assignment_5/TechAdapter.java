package com.example.assignment_5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TechAdapter extends RecyclerView.Adapter<TechAdapter.TechViewHolder> {
    private Context context;
    private List<TechItem> techList;

    public TechAdapter(Context context, List<TechItem> techList) {
        this.context = context;
        this.techList = techList;
    }

    public static class TechViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewTech;
        TextView textViewTechName;
        TextView textViewTechDescription;

        public TechViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewTech = itemView.findViewById(R.id.imageViewTech);
            textViewTechName = itemView.findViewById(R.id.textViewTechName);
            textViewTechDescription = itemView.findViewById(R.id.textViewTechDescription);
        }
    }

    @NonNull
    @Override
    public TechViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tech, parent, false);
        return new TechViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TechViewHolder holder, int position) {
        TechItem techItem = techList.get(position);
        holder.imageViewTech.setImageResource(techItem.getImageResId());
        holder.textViewTechName.setText(techItem.getName());
        holder.textViewTechDescription.setText(techItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return techList.size();
    }
}
