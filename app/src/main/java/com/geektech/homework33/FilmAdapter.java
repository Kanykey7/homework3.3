package com.geektech.homework33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmViewHolder> {

    private ArrayList<String> filmList;

    public FilmAdapter(ArrayList<String> filmList) {
        this.filmList = filmList;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_films, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.bind(filmList.get(position));
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }
}
