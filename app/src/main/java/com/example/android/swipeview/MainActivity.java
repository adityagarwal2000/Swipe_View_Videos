package com.example.android.swipeview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.android.swipeview.Model.VideoModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private ArrayList<VideoModel> videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewPager2 = findViewById(R.id.viewpager);
        videos = new ArrayList<>();
        videos.add(new VideoModel("For Bigger Fun",
                "Introducing Chromecast. The easiest way to enjoy online video and music on your TV. For $35.",
                "By Google", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4"));
        videos.add(new VideoModel("Elephant Dream",
                "The first Blender Open Movie from 2006",
                "By Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"));
        videos.add(new VideoModel("For Bigger Blazes",
                "For when you want to settle into your Iron Throne to watch the latest episodes.",
                "By Google", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"));
        videos.add(new VideoModel("Big Buck Bunny",
                "Big Buck Bunny tells the story of a giant rabbit with a heart bigger than himself.",
                "By Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"));
        videos.add(new VideoModel("For Bigger Joyrides",
                "Introducing Chromecast. The easiest way to enjoy online video and music on your TV—for the times that call for bigger joyrides.",
                "By Google", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4"));
        videos.add(new VideoModel("Sintel",
                "Sintel is a short film, initiated as a means to further improve and validate the free/open source 3D creation suite Blender",
                "By Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"));
        viewPager2.setAdapter(new VideoAdapter(videos));
    }
}