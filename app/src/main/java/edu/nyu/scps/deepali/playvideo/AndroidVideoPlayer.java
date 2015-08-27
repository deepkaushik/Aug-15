package edu.nyu.scps.deepali.playvideo;
/**
 * Created by 205263 on 8/22/15.
 */

import android.app.Activity;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

//Implement SurfaceHolder interface to Play video
//Implement this interface to receive information about changes to the surface
public class AndroidVideoPlayer extends Activity implements SurfaceHolder.Callback {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlayVideo = (Button) findViewById(R.id.playvideoplayer);

        getWindow().setFormat(PixelFormat.UNKNOWN);

        //Displays a video file.
        VideoView mVideoView = (VideoView) findViewById(R.id.videoview);

        String uriPath = "android.resource://" + getPackageName() + "/" + +R.raw.k;
        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();

        //Video controls
        mVideoView.setVideoURI(uri);
        mVideoView.setMediaController(new MediaController(this)); //the controls for the VideoView
        mVideoView.requestFocus();


        buttonPlayVideo.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // VideoView reference see main.xml
                VideoView mVideoView = (VideoView) findViewById(R.id.videoview);

                String uriPath = "android.resource://" + getPackageName() + "/" + +R.raw.k;
                Uri uri = Uri.parse(uriPath);
                mVideoView.setVideoURI(uri);
                mVideoView.requestFocus();
                mVideoView.start();


            }
        });


    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }
}

