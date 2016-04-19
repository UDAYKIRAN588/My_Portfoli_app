package com.fill_tummy.uday.myappportfolio;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by dlrl on 13/04/16.
 */
public class MovieAdapter extends BaseAdapter {

    ArrayList<Images> ai = new ArrayList<Images>();
    Context co;


    MovieAdapter(Context c) {
        co = c;

        ai.add(new Images("http://image.tmdb.org/t/p/w185//vsjBeMPZtyB7yNsYY56XYxifaQZ.jpg?api_key=7667bea95e217faaa8cba7e0be656bdd"));
        ai.add(new Images("http://image.tmdb.org/t/p/w185//vsjBeMPZtyB7yNsYY56XYxifaQZ.jpg?api_key=7667bea95e217faaa8cba7e0be656bdd"));
        ai.add(new Images("http://image.tmdb.org/t/p/w185//vsjBeMPZtyB7yNsYY56XYxifaQZ.jpg?api_key=7667bea95e217faaa8cba7e0be656bdd"));

    }

    @Override
    public int getCount() {
        return ai.size();
    }

    @Override
    public Object getItem(int position) {
        return ai.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater li = (LayoutInflater) co.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = li.inflate(R.layout.movie_poster, parent, false);
        //TextView tv = (TextView) row.findViewById(R.id.tv);
        //tv.setText(ai.get(position).uri1);
        ImageView img1 = (ImageView) row.findViewById(R.id.poster1);

        // ImageView img2 = (ImageView) row.findViewById(R.id.poster2);
        Picasso.with(co).load(ai.get(position).uri1).into(img1);
        Log.d("Uday", ai.get(position).uri1);
        //Picasso.with(co).load(ai.get(position).uri2).into(img2);
        return row;
    }
}

class Images {


    String uri1 = "";
    String uri2 = "";

    Images(String u2) {

        uri1 = u2;

    }
}
