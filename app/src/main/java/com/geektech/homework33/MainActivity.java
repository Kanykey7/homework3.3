package com.geektech.homework33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList filmList = new ArrayList();
    private RecyclerView rvFilm;
    private FilmAdapter adapter = new FilmAdapter(filmList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvFilm = findViewById(R.id.recycler_view);
        rvFilm.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        filmList.add("Psycho");
        filmList.add("Alien");
        filmList.add("Rosemary's Baby");
        filmList.add("The Thing");
        filmList.add("The Shining");
        filmList.add("The Exorcist");
        filmList.add("Night of the Living Dead");
        filmList.add("Halloween");
        filmList.add("Jaws");
        filmList.add("Frankenstein");
        filmList.add("Get Out");
        filmList.add("The Tehas Chain Saw Massacre");
        filmList.add("Insidious");
        filmList.add("Insidious: Chapter 2");
        filmList.add("The Purge");
        filmList.add("Annabelle");
        filmList.add("Chucky");
        filmList.add("Lights Out");
        filmList.add("Friday the 13th");
        filmList.add("Carrie");




    }
}