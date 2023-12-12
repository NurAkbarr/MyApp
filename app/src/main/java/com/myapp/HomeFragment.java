package com.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvMovie = view.findViewById(R.id.homefragment);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerMovie();  // Perubahan disini

        return view;
    }

    private void showRecyclerMovie() {  // Perubahan disini
        rvMovie.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        CardViewMovieAdapter cardViewMovieAdapter = new CardViewMovieAdapter(requireContext());
        cardViewMovieAdapter.setListMovie(list);
        rvMovie.setAdapter(cardViewMovieAdapter);
    }
}
