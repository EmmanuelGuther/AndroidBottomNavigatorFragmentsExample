package com.emmanuelguther.bottomnavigatorexample;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemOneFragment extends Fragment {

    public static ItemOneFragment newInstance(){
        ItemOneFragment itemOneFragment = new ItemOneFragment();
        return itemOneFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}