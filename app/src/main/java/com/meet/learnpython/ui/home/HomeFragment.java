package com.meet.learnpython.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.meet.learnpython.*;
import com.meet.learnpython.R;

public class HomeFragment extends Fragment {
    AdView mAdview;
    AdRequest adRequest;
    ListView listView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        mAdview = (AdView) root.findViewById(R.id.adView);
        adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        listView = (ListView) root.findViewById(R.id.listView);

        final String[] values = new String[] {
                "Python Introduction",
                        "Python Features",
                        "Python Environment Setup",
                        "Python First Example",
                        "Python Variable",
                        "Python Input/Output",
                        "Python Comments",
                        "Python Data Types",
                        "Python Type Conversion",
                        "Python Keyword",
                        "Python Literals",
                        "Python Operators",
                        "Python If Else",
                        "Python Loops",
                        "Python Break & Continue",
                        "Python Pass",
                        "Python Numbers",
                        "Python List",
                        "Python Tuple",
                        "Python String",
                        "Python Set",
                        "Python Dictionary",
                        "Python Function",
                        "Python Recursion",
                        "Python Lambda Function",
                        "Python Variable Scope",
                        "Python Module",
                        "Python Packages",
                        "Python File Handling",
                        "Python Exception Handling",
                        "Python User Defined Exception",
                        "Python Date/Time",
                        "Python Math",
                        "Python Regular Expression",
                        "Python Class",
                        "Python Object",
                        "Python Constructor",
                        "Pyhton Overloading",
                        "Pyhton Inheritance",
                        "Python Encapsulation",
                        "Python Abstraction",
                        "Python Polymorphism",
                        "Python Thread Programming",
                        "Python Socket Programming",
                        "Python Iterator",
                        "Python Generator",
                        "Python Closure",
                        "Python Decorator",
                        "Python Property",
                "Python Searching",
                "Python Bubble Sort",
                "Python Insertion Sort",
                "Python Merge Sort",
                "Python Selection Sort",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.listview, values);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                Intent i = new Intent(HomeFragment.this.getActivity(), PY_1.class);
                i.putExtra("key", itemPosition+"");
                i.putExtra("key1", values[itemPosition]);
                startActivity(i);
            }

        });
        return root;
    }
}
