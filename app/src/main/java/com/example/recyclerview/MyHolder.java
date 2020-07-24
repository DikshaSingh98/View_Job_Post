package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {


    TextView titleTV,descriptionTV,locationTV,jobTV,stipentTV,educationTV;
    ImageView img;
    public MyHolder(@NonNull View itemView) {
        super(itemView);


        this.titleTV=itemView.findViewById(R.id.titleTV);
        this.descriptionTV=itemView.findViewById(R.id.descriptionTV);
        this.locationTV=itemView.findViewById(R.id.locationTV);
        this.jobTV=itemView.findViewById(R.id.jobTV);
        this.stipentTV=itemView.findViewById(R.id.stipentTV);
        this.educationTV=itemView.findViewById(R.id.educationTV);
        this.img=itemView.findViewById(R.id.img);







    }
}
