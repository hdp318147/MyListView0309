package com.example.administrator.mylistview0309;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    String[] datas = {"小明","张三","李思","小红","小花"};
    TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.tvName,datas);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String s = datas[position];
        tv.setText(s);
        Log.e("TEXT", "onListItemClick: "+position);
        super.onListItemClick(l, v, position, id);
    }
}
