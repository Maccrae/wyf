package com.example.administrator.information;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        List<String> list = new ArrayList<>();
        list.add("冯俊文，大一");
        list.add("何昊然，大一");
        list.add("陈爽，大一");
        list.add("戈洋，大一");
        System.out.println(list);
        adapter = new MyAdapter(this,list);
        recyclerView.setAdapter(adapter);
    }
}
