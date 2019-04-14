package com.alaa7amdy.sendapd;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list);

        textViewTitle = (TextView)findViewById(R.id.title);

        String[] items = getResources().getStringArray(R.array.index);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"font.otf");

        textViewTitle.setTypeface(typeface);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.storyname,items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("index",position);
                startActivity(intent);
            }
        });
    }
}
