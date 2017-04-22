package com.example.turate.assignment3;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by turate on 16-04-2017.
 */

public class CustomGrid extends BaseAdapter {
    private Context mcontext;
    private final String[] web;
    private final Integer[] Imageid;

    public CustomGrid(Context c, String[] web, Integer[] Imageid) {
        mcontext = c;
        this.Imageid =Imageid;
        this.web = web;
    }

    @Override
    public int getCount() {
        return web.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflator = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            grid = new View(mcontext);
            grid =inflator.inflate(R.layout.image_view, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);
            textView.setText(web[position]);
            textView.setAllCaps(true);
            imageView.setImageResource(Imageid[position]);

        }
        else {
            grid = convertView;
        }
        return grid;
    }
}
