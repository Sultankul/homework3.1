package com.example.homework31;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapterContact extends RecyclerView.Adapter<ViewHolder> {

    private final List<Information> informations;

    public adapterContact(MainActivity mainActivity, List<Information> informations) {
        this.informations = informations;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Information information = informations.get(position);



    }

    @Override
    public int getItemCount() {
        return informations.size();

    }
}
