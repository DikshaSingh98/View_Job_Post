package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.titleTV.setText(models.get(position).getTitleTV());
        holder.descriptionTV.setText(models.get(position).getDescriptionTV());
        holder.locationTV.setText(models.get(position).getLocationTV());
        holder.jobTV.setText(models.get(position).getJobTV());
        holder.stipentTV.setText(models.get(position).getStipentTV());
        holder.educationTV.setText(models.get(position).getEducationTV());
        holder.img.setImageResource(models.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
