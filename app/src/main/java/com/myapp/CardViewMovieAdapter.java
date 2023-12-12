package com.myapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;

    public CardViewMovieAdapter(Context context) {
        this.context = context;
        this.listMovie = new ArrayList<>();
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie.clear();
        this.listMovie.addAll(listMovie);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Movie movie = listMovie.get(position);
        Glide.with(context)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvttitle.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvttitle;

        CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.imagecover);
            tvttitle = itemView.findViewById(R.id.texttitle);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                Movie movie = listMovie.get(position);

                Intent intent = new Intent(context, DetailMovieActivity.class);
                intent.putExtra("MOVIE_DATA", movie);
                context.startActivity(intent);

            }
        }
    }
}
