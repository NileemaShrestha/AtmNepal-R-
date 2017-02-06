package com.wlit.nileema.atmnepalr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    int[] image={R.drawable.hbl,R.drawable.evb,R.drawable.nrb};
    String[] name={"Himalayan Bank Limited","Everest Bank","Nepal Rastra Bank"};
    String [] contactdetail={"5549675","44789562","47789663"};
    String[] description={"10:00am-5:00pm","9:00am-5:00pm","9:00-4pm"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        adapter=new RecyclerAdapter(name,contactdetail,description,image);

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }
}
