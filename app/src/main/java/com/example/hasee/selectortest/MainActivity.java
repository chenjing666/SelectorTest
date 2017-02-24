package com.example.hasee.selectortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    ListView listView;
    Button button;
//    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        textView2 = (TextView) findViewById(R.id.tv2);
        textView.setOnClickListener(null);
        textView2.setOnClickListener(null);
        listView = (ListView) findViewById(R.id.lv);
//        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, getData()));
//        adapter=new ArrayAdapter<String>(this, R.layout.item, getData());
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.item, getData()));
        listView.setOnItemClickListener(listen);
        button= (Button) findViewById(R.id.btn);
        button.setOnClickListener(null);
//        Drawable drawable=getResources().getDrawable(R.drawable.mylist_view);
//        listView.setSelector(drawable);
    }

    List<String> data = new ArrayList<String>();

    public List<String> getData() {
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
        return data;
    }
//    android:state_selected 选中
//    android:state_focused 获得焦点
//    android:state_pressed 点击
//    android:state_enabled 设置是否响应事件,指所有事件
    private AdapterView.OnItemClickListener listen = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(MainActivity.this, "hello" + (position + 1), Toast.LENGTH_SHORT).show();

        }
    };


}
