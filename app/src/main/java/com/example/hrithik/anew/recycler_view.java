package com.example.hrithik.anew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

public class recycler_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Log.i("result","in recycler");

        RecyclerView list = findViewById(R.id.recyclerView);
        list.setLayoutManager(new LinearLayoutManager(this));
        String[] itemlist={"item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 10"};
        list.setAdapter(new MyAdapter(itemlist));
    }
}
