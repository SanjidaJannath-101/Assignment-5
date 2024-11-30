package com.example.assignment_5;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TechAdapter adapter;
    private List<TechItem> techList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        techList = new ArrayList<>();
        techList.add(new TechItem(R.drawable.ic_smartphone, "Smartphone", "A portable device combining mobile phone and computing functions."));
        techList.add(new TechItem(R.drawable.ic_laptop, "Laptop", "A compact personal computer with a screen and keyboard."));
        techList.add(new TechItem(R.drawable.ic_smartwatch, "Smartwatch", "A wearable computing device worn on the wrist."));
        techList.add(new TechItem(R.drawable.ic_vr_headset, "VR Headset", "A head-mounted device for virtual reality experiences."));
        techList.add(new TechItem(R.drawable.ic_drone, "Drone", "Aerial device used for photography and delivery tasks."));
        techList.add(new TechItem(R.drawable.ic_tablet, "Tablet", "A handheld computing device larger than a smartphone."));
        techList.add(new TechItem(R.drawable.ic_router, "Wi-Fi Router", "A device that enables wireless internet connectivity."));
        techList.add(new TechItem(R.drawable.ic_keyboard, "Mechanical Keyboard", "A high-performance keyboard for typing and gaming."));
        techList.add(new TechItem(R.drawable.ic_mouse, "Gaming Mouse", "A high-precision mouse designed for gaming."));
        techList.add(new TechItem(R.drawable.ic_speaker, "Bluetooth Speaker", "A portable speaker for wireless music playback."));
        techList.add(new TechItem(R.drawable.ic_headphone, "Noise-Canceling Headphone", "Headphones with active noise cancellation."));

        adapter = new TechAdapter(this, techList);
        recyclerView.setAdapter(adapter);
    }
}
