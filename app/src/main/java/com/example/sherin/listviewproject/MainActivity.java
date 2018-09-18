package com.example.sherin.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    //String[]dist={"Dhaka","Chitagong","Khulna","Chuadanga"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.listViewId);
      final String[]dist=getResources().getStringArray(R.array.dist);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.sample_layout,R.id.textViewId,dist);

         listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 String value=dist[i];
                 Toast.makeText(MainActivity.this, "value", Toast.LENGTH_SHORT).show();
             }
         });
    }
}
