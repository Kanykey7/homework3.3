package com.geektech.homework33;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmViewHolder extends RecyclerView.ViewHolder {

    private TextView tvFilm;

    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFilm = itemView.findViewById(R.id.tv_film);
    }
    public void bind(String film) {
        tvFilm.setText(film);
    }
}
