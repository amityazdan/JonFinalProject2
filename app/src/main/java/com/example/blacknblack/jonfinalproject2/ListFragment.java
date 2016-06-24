package com.example.blacknblack.jonfinalproject2;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public String search_str;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_list, container, false);


        Intent intent = new Intent(getActivity(), ListService.class);
        intent.putExtra("searchtext", search_str);
        getActivity().startService(intent);
        return view;
    }

}
