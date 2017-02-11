package app.com.example.jking.jkingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String title = "Hello Android";

    Button button_news;
    Button button_movie;
    Button button_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_news = (Button)findViewById(R.id.button_news);
        button_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Application: News", Toast.LENGTH_SHORT).show();
            }
        });
        button_movie = (Button)findViewById(R.id.button_movie);
        button_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Application: Movie", Toast.LENGTH_SHORT).show();
            }
        });
        button_photo =(Button)findViewById(R.id.button_photo);
        button_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Application: Photo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
