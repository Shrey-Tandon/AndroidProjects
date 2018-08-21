package com.example.punnit.dlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Mydesign extends BaseAdapter {
    LayoutInflater inft;
    ArrayList<String>nm=new ArrayList<>();
    ArrayList<String>mb=new ArrayList<>();

    Context context;

    public Mydesign(Context cnt, ArrayList<String>nm,ArrayList<String>mb){
        this.nm=nm;
        this.mb=mb;
        context=cnt;
        inft=LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return nm.size();
    }

    @Override
    public Object getItem(int i) {
        return nm.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

                   view=inft.inflate(R.layout.mydesignformat,null);

        TextView t1=(TextView)view.findViewById(R.id.textView);
        TextView t2=(TextView)view.findViewById(R.id.textView2);

           t1.setText(nm.get(i));
        t2.setText(mb.get(i));

        return view;
    }
}
