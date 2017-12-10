package com.example.niharika.mixed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by niharika on 10/1/17.
 */

public class CustomGrid extends BaseAdapter {

    private Context mContext;
    public String[] CarBrand1;
    public int[] CarId1;


    CustomGrid(Context mcontext, String[] CarBrand, int[] CarId){
        this.mContext=mcontext;
        CarBrand1=CarBrand;
        CarId1= CarId;

    }

    @Override
    public int getCount() {
        return CarBrand1.length;
    }

    @Override
    public Object getItem(int i) {
        return CarId1[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;

        LayoutInflater inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_single, null);

        } else {
            grid = (View) view;
        }

        TextView textView = (TextView) grid.findViewById(R.id.grid_text);
        ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
        textView.setText(CarBrand1[i]);
        imageView.setImageResource(CarId1[i]);
        return grid;
    }
}
