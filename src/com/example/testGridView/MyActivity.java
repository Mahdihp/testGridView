package com.example.testGridView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private ArrayList<TblTitle> navDrawerItems2;
    GridView Masaleh_GridView;
    //private AsymmetricGridView<DemoItem> listView;
    private ListAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Masaleh_GridView=(GridView)findViewById(R.id.gridView);
        //listView = (AsymmetricGridView<DemoItem>) findViewById(R.id.listView);
       // adapter = new ListAdapter(this, listView, new ArrayList<DemoItem>());

//        listView.setRequestedColumnCount(3);
//        listView.setAdapter(adapter);
//        listView.setDebugging(true);

        navDrawerItems2 = new ArrayList<TblTitle>();

        navDrawerItems2.add(new TblTitle(1,1,"mahdi-1"));
        navDrawerItems2.add(new TblTitle(1,1,"mahdi-2"));
        navDrawerItems2.add(new TblTitle(1,1,"mahdi-3"));
        navDrawerItems2.add(new TblTitle(1,1,"mahdi-4"));
        navDrawerItems2.add(new TblTitle(1,1,"mahdi-5"));

        Title_Adapter obj1 = new Title_Adapter(this, navDrawerItems2);
        Masaleh_GridView.setAdapter(obj1);

    }
}

