package com.stfx.distantatthisinstant.ui.aboutus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.stfx.distantatthisinstant.AboutUsScrollView;
import com.stfx.distantatthisinstant.R;

public class AboutUsFragment extends Fragment {

    private AboutUsViewModel aboutUsViewModel;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aboutUsViewModel =
                new ViewModelProvider(this).get(AboutUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_aboutus, container, false);
        Intent myIntent = new Intent(getActivity(), AboutUsScrollView.class);
        getActivity().startActivity(myIntent);
        return root;
    }
}
