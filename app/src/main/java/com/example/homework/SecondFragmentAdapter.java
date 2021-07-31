package com.example.homework;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragmentAdapter extends RecyclerView.Adapter<SecondFragmentAdapter.ViewHolder> {

    ArrayList<MusicModel> list = new ArrayList<>();


    public void addList(ArrayList<MusicModel> list) {
        this.list.addAll(list);
    }

    Listener listener;

    void setListener(Listener listener){
        this.listener = listener;

    }


    @NonNull
    @Override
    public SecondFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_second_frame, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SecondFragmentAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView number;
        private TextView name;
        private TextView singer;
        private TextView timeTV;
        private MusicModel model;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number_tv_item);
            name = itemView.findViewById(R.id.name_tv_item);
            singer = itemView.findViewById(R.id.singer_tv_item);
            timeTV = itemView.findViewById(R.id.time);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick();
                }
            });
        }

        public void onBind(MusicModel musicModel) {
            number.setText(musicModel.getNumber());
            name.setText(musicModel.getName());
            model = musicModel;
            singer.setText(musicModel.getSinger());
            timeTV.setText(musicModel.getTime());
        }
    }
}
