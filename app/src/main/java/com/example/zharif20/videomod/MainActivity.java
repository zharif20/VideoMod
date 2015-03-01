package com.example.zharif20.videomod;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends ActionBarActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //locate the button
        button = (Button)findViewById(R.id.mybutton);

        //capture button clicks
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                //Start new activity class

                Intent myIntent = new Intent(MainActivity.this,VideoViewActivity.class );
                startActivity(myIntent);
            }
            });
        }
        }

// //reference the VideoView using the id in the xml layout

//VideoView vidView = (VideoView)findViewById(R.id.myVideo);

//

////prepare the uri endpoint

//String vidAddress = "https://www.youtube.com/watch?v=GCdwKhTtNNw";

//Uri vidUri = Uri.parse(vidAddress);

//vidView.setVideoURI(vidUri);

//

//

//MediaController vidControl = new MediaController(this);

//vidControl.setAnchorView(vidView);

//vidView.setMediaController(vidControl);

//

//vidView.start();/*

//

//

//}

