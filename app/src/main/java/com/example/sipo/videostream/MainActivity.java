package com.example.sipo.videostream;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class MainActivity extends ActionBarActivity implements SurfaceHolder,SurfaceHolder.Callback,MediaPlayer.OnPreparedListener {
    private MediaPlayer mediaplayer;
    private SurfaceHolder vidholder;
    private SurfaceView vidsurface;
    private String vidAddress ="https://youtu.be/xYh1qAYzDNE?list=TLnCZi3_jTVN0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        VideoView myvideo = (VideoView)findViewById(R.id.myVideo);
        String VideoUrl = "https://archive.org/download/ksnn_compilation_master_the_internet"+
                "/ksnn_compilation_master_the_internet_512kb.mp4";
        String Urlvidio = "https://youtu.be/xYh1qAYzDNE?list=TLnCZi3_jTVN0";
        Uri vidUri = Uri.parse(VideoUrl);
        myvideo.setVideoURI(vidUri);
        myvideo.start();
        */

        vidsurface = (SurfaceView)findViewById(R.id.surfaceView);
        vidholder = vidsurface.getHolder();
        vidholder.addCallback(this);

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        try{
            mediaplayer = new MediaPlayer();
            mediaplayer.setDisplay(vidholder);
            mediaplayer.setDataSource(vidAddress);
            mediaplayer.prepare();
            mediaplayer.setOnPreparedListener(this);
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mediaplayer.start();
    }

    @Override
    public void addCallback(Callback callback) {

    }

    @Override
    public void removeCallback(Callback callback) {

    }

    @Override
    public boolean isCreating() {
        return false;
    }

    @Override
    public void setType(int type) {

    }

    @Override
    public void setFixedSize(int width, int height) {

    }

    @Override
    public void setSizeFromLayout() {

    }

    @Override
    public void setFormat(int format) {

    }

    @Override
    public void setKeepScreenOn(boolean screenOn) {

    }

    @Override
    public Canvas lockCanvas() {
        return null;
    }

    @Override
    public Canvas lockCanvas(Rect dirty) {
        return null;
    }

    @Override
    public void unlockCanvasAndPost(Canvas canvas) {

    }

    @Override
    public Rect getSurfaceFrame() {
        return null;
    }

    @Override
    public Surface getSurface() {
        return null;
    }
}
