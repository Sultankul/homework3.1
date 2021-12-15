package com.example.homework31;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




public class ViewHolder extends RecyclerView.ViewHolder {


    private ImageView imageView;
    private TextView nameContact;
    private TextView numberContact;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.image);
        nameContact=itemView.findViewById(R.id.name_contact);
        numberContact = itemView.findViewById(R.id.number);

    }

 public void onBind(String name, int number,int image ){
        nameContact.setText(name);
        numberContact.setText(number);
        imageView.setImageResource(image);
}
}
