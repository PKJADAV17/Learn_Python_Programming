package com.meet.learnpython.ui.example;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.meet.learnpython.Editor;
import com.meet.learnpython.ExpandableListAdapter;
import com.meet.learnpython.ExpandableListData;
import com.meet.learnpython.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class PyExampleFragment extends Fragment {
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    LinkedHashMap<String, List<String>> expandableListDetail;
    AdView mAdview;
    AdRequest adRequest;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_py_example, container, false);

        mAdview = (AdView) root.findViewById(R.id.adView);
        adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        expandableListView = (ExpandableListView) root.findViewById(R.id.expandableListView);
        expandableListDetail = ExpandableListData.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandableListAdapter(getActivity(), expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                Intent i = new Intent(getActivity(), Editor.class);
                i.putExtra("key",""+groupPosition);
                i.putExtra("key1",""+childPosition);
                i.putExtra("key2",""+expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition));
                startActivity(i);

                return false;
            }
        });

        return root;
    }
}