package com.bignerdranch.slidingpuzzle;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PuzzleFragment extends Fragment {

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_puzzle, container, false);
    }
}
