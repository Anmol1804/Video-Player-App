package com.example.videoplayerapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoview : VideoView = findViewById(R.id.vid1)

        // local path
        videoview.setVideoPath(
            "android.resource://"
            + packageName + "/"
            + R.raw.mountains)

        // controls for video - play pause seek ..
        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoview)
        mediaController.setMediaPlayer(videoview)
        videoview.setMediaController(mediaController)
        // automatically start as app launch
        // if not specify click video and play from media conroller
        videoview.start()




        // displaying video from internet
        val videoview2 : VideoView = findViewById(R.id.vid2)
        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")
        videoview2.setVideoURI(uri)

        // media controller for vid2
        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoview2)
        mediaController2.setMediaPlayer(videoview2)
        videoview2.setMediaController(mediaController2)
        videoview2.start()
        // after in manifest add user internet permission to play from internet


    }
}