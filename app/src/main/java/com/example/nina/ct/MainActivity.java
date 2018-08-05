package com.example.nina.ct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /* NAME :

     NINA ZHANG

     ID NUM:

     215319003 */
    int[] IMAGES = {R.drawable.mom, R.drawable.dad, R.drawable.henry, R.drawable.luv, R.drawable.sis, R.drawable.fang,
            R.drawable.wang, R.drawable.david, R.drawable.leon, R.drawable.ex};

    String[] NAMES = {"mom", "dad", "henry", "kim", "yuan", "fang", "wang", "david", "leon", "ex"};
    String[] DESCRIPTIONS = {"+61413450279", "+61412345678", "+61413451234", "+61413454567", "+61413456789", "+61413457890", "+61413450987", "+61413450765", "+61413450654", "+61413450000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.infolayout, null);

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_name = (TextView) view.findViewById(R.id.textView2_name);
            TextView textView_description = (TextView) view.findViewById(R.id.textView3_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);
            return view;

        }
    }
}