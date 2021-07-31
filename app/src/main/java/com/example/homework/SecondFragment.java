package com.example.homework;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;
    private SecondFragmentAdapter adapter;
    private ArrayList<MusicModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
        list = new ArrayList<>();
        createList();
        adapter.addList(list);
        adapter.setListener(new Listener() {
            @Override
            public void onClick() {
                Intent intent = new Intent(requireActivity(),MainActivity2.class);
                requireActivity().startActivity(intent);
            }

        });
    }

    private void createList() {
        list.add(new MusicModel("1","птичка", "hamalli and Navai","3:11"));
        list.add(new MusicModel("2","птичка", "hamalli and Navai","3:11"));
        list.add(new MusicModel("3","птичка", "hamalli and Navai","3:11"));
        list.add(new MusicModel("4","птичка", "hamalli and Navai","3:11"));
        list.add(new MusicModel("5","птичка", "hamalli and Navai","3:11"));
        list.add(new MusicModel("6","птичка", "hamalli and Navai","3:11"));
        list.add(new MusicModel("7","птичка", "hamalli and Navai","3:11"));

    }

    private void initRecycler(View view) {

        recyclerView = view.findViewById(R.id.recycler_secondFrame);
        adapter = new SecondFragmentAdapter();
        recyclerView.setAdapter(adapter);

    }





}