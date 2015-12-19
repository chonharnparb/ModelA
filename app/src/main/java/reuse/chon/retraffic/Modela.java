package reuse.chon.retraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Modela extends AppCompatActivity {
    //Explicit
    private ListView trafficListView;
    private Button abouttimeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modela);

        //Bind Widget
        bindWidget();


        //Button Controller
        buttoncontroller();


    } //Main Method

    private void buttoncontroller() {
    abouttimeButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
      // Sound Effect
            MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.effect_btn_long);
            buttonMediaPlayer.start();


            //Intent to Webview
            Intent objIntent = new Intent(Intent.ACTION_VIEW);
            objIntent.setData(Uri.parse("https://youtu.be/YhTxX5_0m6s"));
            startActivity(objIntent);

        } // event
    });
    }


    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        abouttimeButton = (Button) findViewById(R.id.button);
    }


} // Main Class
