package com.bignerdranch.slidingpuzzle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PuzzleGridAdapter extends RecyclerView.Adapter<PuzzleGridAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mPlaceholderTextView;

        public ViewHolder(View v) {
            super(v);
            mPlaceholderTextView = (TextView)v.findViewById(R.id.placeholder_textView);
        }
    }

    @Override
    public PuzzleGridAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.puzzle_tile_cardview, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PuzzleGridAdapter.ViewHolder viewHolder, int i) {
        viewHolder.mPlaceholderTextView.setText("placeholder");
    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
