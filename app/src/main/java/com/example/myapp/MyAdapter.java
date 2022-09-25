package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.compose.State;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;

    ArrayList<state> list;

    public MyAdapter(Context context, ArrayList<state> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        state state = list.get(position);
        holder.famousplace.setText(state.getFamousplace());
        holder.famousitem.setText(state.getFamousitem());
        holder.famoushotel.setText(state.getFamoushotel());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView famousplace,famousitem,famoushotel ;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            famousplace = itemView.findViewById(R.id.famousplace);
            famousitem =itemView.findViewById(R.id.famousitem);
            famoushotel = itemView.findViewById(R.id.famoushotel);
        }
    }
}
