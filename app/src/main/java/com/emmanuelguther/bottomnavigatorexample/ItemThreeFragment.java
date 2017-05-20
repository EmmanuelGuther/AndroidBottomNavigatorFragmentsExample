package com.emmanuelguther.bottomnavigatorexample;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemThreeFragment extends Fragment {

    public static ItemThreeFragment newInstance(){
        ItemThreeFragment itemOneFragment = new ItemThreeFragment();
        return itemOneFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}