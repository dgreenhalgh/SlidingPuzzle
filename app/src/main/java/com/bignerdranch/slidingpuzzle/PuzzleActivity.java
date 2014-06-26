package com.bignerdranch.slidingpuzzle;

import android.support.v4.app.Fragment;

public class PuzzleActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new PuzzleFragment();
    }
}
