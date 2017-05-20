package com.emmanuelguther.bottomnavigatorexample;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemFourFragment extends Fragment {

    public static ItemFourFragment newInstance(){
        ItemFourFragment itemOneFragment = new ItemFourFragment();
        return itemOneFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_four, container, false);
    }
}