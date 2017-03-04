package com.example.turate.assignment3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // To display name of the android version clicked
                switch (position){
                    case 0 : name = "GingerBread";
                        break;
                    case 1 : name = "HoneyComb";
                        break;
                    case 2 : name = "IceCream";
                        break;
                    case 3 : name = "JellyBean";
                        break;
                    case 4 : name = "KitKat";
                        break;
                    case 5 : name = "Lollipop";
                        break;
                }

                Toast.makeText(MainActivity.this, "" + name,
                        Toast.LENGTH_SHORT).show();
            }
    });
}

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(10, 40, 10, 40);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to images
    private Integer[] mThumbIds = {
            R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean, R.drawable.kitkat,
            R.drawable.lollipop
    };
}}
