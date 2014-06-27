package com.bignerdranch.slidingpuzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.widget.RecyclerView;

public class PuzzleFragment extends Fragment {

    private Button mNextButton;

    private RecyclerView mPuzzleGridRecyclerView;
    private RecyclerView.Adapter mPuzzleGridAdapter;
    private RecyclerView.LayoutManager mPuzzleGridLayoutManager;

    public static PuzzleFragment newInstance() {
        PuzzleFragment fragment = new PuzzleFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    public PuzzleFragment() {
        setRetainInstance(true);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_puzzle, container, false);

        mPuzzleGridRecyclerView = (RecyclerView)view.findViewById(R.id.puzzle_grid_recyclerView);
        mPuzzleGridRecyclerView.setHasFixedSize(true);

        mPuzzleGridLayoutManager = new PuzzleGridLayoutManager();
        mPuzzleGridRecyclerView.setLayoutManager(mPuzzleGridLayoutManager);

        mPuzzleGridAdapter = new PuzzleGridAdapter();
        mPuzzleGridRecyclerView.setAdapter(mPuzzleGridAdapter);

        return view;
    }
}
