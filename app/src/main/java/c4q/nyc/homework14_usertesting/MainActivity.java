package c4q.nyc.homework14_usertesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import c4q.nyc.homework14_usertesting.controller.NewsFeedAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView newsRecyclerView = findViewById(R.id.news_recyclerview);
        NewsFeedAdapter newsAdapter = new NewsFeedAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        newsRecyclerView.setAdapter(newsAdapter);
        newsRecyclerView.setLayoutManager(gridLayoutManager);
    }
}
