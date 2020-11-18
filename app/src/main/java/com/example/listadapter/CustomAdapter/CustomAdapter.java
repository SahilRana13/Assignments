package com.example.listadapter.CustomAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listadapter.R;
import com.example.listadapter.models.Movie;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<Movie> movies;

    public CustomAdapter(ArrayList<Movie> movies)
    {
        this.movies = movies;
    }


    private Integer[] movieImages = {
            R.drawable.Don2,
            R.drawable.Raees,
            R.drawable.Fan,
            R.drawable.Zero,
            R.drawable.HeraPheri,
            R.drawable.Dhol,
            R.drawable.Dhamal,
            R.drawable.KhattaMeetha
    };

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movie getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_custom_row_layout,null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Movie movie = getItem(position);
        viewHolder.movieTitleTv.setText(movie.getMovieName());
        viewHolder.ratingTv.setText(movie.getRating());
        viewHolder.descriptionTv.setText(movie.getDescription());


        return convertView;
    }

    class ViewHolder
    {
        TextView movieTitleTv;
        TextView ratingTv;
        TextView descriptionTv;
        ImageView imageIv;

        public ViewHolder(View view)
        {
            movieTitleTv = view.findViewById(R.id.MovieTitle);
            ratingTv = view.findViewById(R.id.MovieRating);
            descriptionTv = view.findViewById(R.id.MovieDescription);
            imageIv = view.findViewById(R.id.MovieImage);
        }

    }
}
