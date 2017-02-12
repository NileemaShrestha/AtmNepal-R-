package com.wlit.nileema.atmnepalr;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nileema on 2/5/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{
    String[] name, contactdetail, description;
    int[] image;
    public RecyclerAdapter(String[] name, String[] contactdetail, String[] description,int[] image){
        this.name=name;
        this.contactdetail=contactdetail;
        this.description=description;
        this.image=image;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.element_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tx_name.setText(name[position]);
        holder.tx_contactdetail.setText(contactdetail[position]);
        holder.tx_description.setText(description[position]);
        holder.img.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView tx_name, tx_contactdetail,tx_description;
        ImageView img;

        public RecyclerViewHolder(View view){
            super(view);
            tx_name=(TextView)view.findViewById(R.id.name);
            tx_contactdetail=(TextView)view.findViewById(R.id.contactdetail);
            tx_description=(TextView)view.findViewById(R.id.description);
            img=(ImageView)view.findViewById(R.id.imageView);
        }
    }
}

