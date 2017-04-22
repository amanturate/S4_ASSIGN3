package com.example.turate.assignment3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this,web, mThumbIds);
        grid = (GridView) findViewById(R.id.gridview);
            grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, web[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    //reference to text
    private String[] web ={
            "GingerBread",
            "HoneyComb",
            "IceCream",
            "JelyBean",
            "KitKat",
            "Lollipop"
    };
    // references to images
    private Integer[] mThumbIds = {
            R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean, R.drawable.kitkat,
            R.drawable.lollipop
    };
}
