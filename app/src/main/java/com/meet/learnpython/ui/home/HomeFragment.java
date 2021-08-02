package com.meet.learnpython.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

import com.meet.learnpython.*;
import com.meet.learnpython.R;

public class HomeFragment extends Fragment {
    private AdView adView;
    ListView listView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        adView = new AdView(getActivity(), getString(R.string.bannerid_PY), AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) root.findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        listView = (ListView) root.findViewById(R.id.listView);

        String[] values = new String[] {
                "Python Introduction",
                "Compiler and Interpreter",
                "Python Input and Output",
                "Python First Program",
                "Python Comment",
                "Python Variables",
                "Python Data Types",
                "Python Number",
                "Python List",
                "Python String",
                "Python Tuple",
                "Python Dictionary",
                "Python Operators",
                "Python If Else",
                "Python Loops",
                "Python Break continue and pass Statement",
                "Python Function",
                "Python Local and Global Variable",
                "Python Module",
                "Python File Handling",
                "Python Exception Handling",
                "Python Class and Object",
                "Python Constructor",
                "Python Inheritance",
                "Python Overloading",
                "Python Encapsulation",
                "Python Regular Expression",
                "Python Multithreading",
                "Python Socket Programming",
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

                if(itemPosition==0) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_1.class);
                    startActivity(i1);
                } else if(itemPosition==1) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_2.class);
                    startActivity(i1);
                }else if(itemPosition==2) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_3.class);
                    startActivity(i1);
                }else if(itemPosition==3) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_4.class);
                    startActivity(i1);
                }else if(itemPosition==4) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_5.class);
                    startActivity(i1);
                }else if(itemPosition==5) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_6.class);
                    startActivity(i1);
                }else if(itemPosition==6) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_7.class);
                    startActivity(i1);
                }else if(itemPosition==7) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_8.class);
                    startActivity(i1);
                }else if(itemPosition==8) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_9.class);
                    startActivity(i1);
                }else if(itemPosition==9) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_10.class);
                    startActivity(i1);
                }else if(itemPosition==10) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_11.class);
                    startActivity(i1);
                }else if(itemPosition==11) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_12.class);
                    startActivity(i1);
                }else if(itemPosition==12) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_13.class);
                    startActivity(i1);
                }else if(itemPosition==13) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_14.class);
                    startActivity(i1);
                }else if(itemPosition==14) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_15.class);
                    startActivity(i1);
                }else if(itemPosition==15) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_16.class);
                    startActivity(i1);
                }else if(itemPosition==16) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_17.class);
                    startActivity(i1);
                }else if(itemPosition==17) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_18.class);
                    startActivity(i1);
                }else if(itemPosition==18) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_19.class);
                    startActivity(i1);
                }else if(itemPosition==19) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_20.class);
                    startActivity(i1);
                }else if(itemPosition==20) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_21.class);
                    startActivity(i1);
                }else if(itemPosition==21) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_22.class);
                    startActivity(i1);
                }else if(itemPosition==22) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_23.class);
                    startActivity(i1);
                }else if(itemPosition==23) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_24.class);
                    startActivity(i1);
                }else if(itemPosition==24) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_25.class);
                    startActivity(i1);
                }else if(itemPosition==25) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_26.class);
                    startActivity(i1);
                }else if(itemPosition==26) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_27.class);
                    startActivity(i1);
                }else if(itemPosition==27) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_28.class);
                    startActivity(i1);
                }else if(itemPosition==28) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_29.class);
                    startActivity(i1);
                }else if(itemPosition==29) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_30.class);
                    startActivity(i1);
                }else if(itemPosition==30) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_31.class);
                    startActivity(i1);
                }else if(itemPosition==31) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_32.class);
                    startActivity(i1);
                }else if(itemPosition==32) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_33.class);
                    startActivity(i1);
                }else if(itemPosition==33) {
                    Intent i1 = new Intent(HomeFragment.this.getActivity(), PY_34.class);
                    startActivity(i1);
                }
            }

        });
        return root;
    }
}
