package reuse.chon.retraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Modela extends AppCompatActivity {
    //Explicit
    private ListView trafficListView;
    private Button abouttimeButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modela);

        //Bind Widget
        bindWidget();


        //Button Controller
        buttoncontroller();

        //ListView Controller
        listViewController();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    } //Main Method

    private void listViewController() {
        //Setup Array #1
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        //Setup Array #2
        final String[] title1Strings = new String[20];
        title1Strings[0] = "หัวข้อที่ 1";
        title1Strings[1] = "หัวข้อที่ 2";
        title1Strings[2] = "หัวข้อที่ 3";
        title1Strings[3] = "หัวข้อที่ 4";
        title1Strings[4] = "หัวข้อที่ 5";
        title1Strings[5] = "หัวข้อที่ 6";
        title1Strings[6] = "หัวข้อที่ 7";
        title1Strings[7] = "หัวข้อที่ 8";
        title1Strings[8] = "หัวข้อที่ 9";
        title1Strings[9] = "หัวข้อที่ 10";
        title1Strings[10] = "หัวข้อที่ 11";
        title1Strings[11] = "หัวข้อที่ 12";
        title1Strings[12] = "หัวข้อที่ 13";
        title1Strings[13] = "หัวข้อที่ 14";
        title1Strings[14] = "หัวข้อที่ 15";
        title1Strings[15] = "หัวข้อที่ 16";
        title1Strings[16] = "หัวข้อที่ 17";
        title1Strings[17] = "หัวข้อที่ 18";
        title1Strings[18] = "หัวข้อที่ 19";
        title1Strings[19] = "หัวข้อที่ 20";
        //Setup Array #3
        String[] strTiile2 = getResources().getStringArray(R.array.title2);
        MyAdapter objMyAdapter = new MyAdapter(Modela.this,title1Strings,strTiile2,intIcon);
        trafficListView.setAdapter(objMyAdapter);

        //Active When Click ListView
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent objIntent = new Intent(Modela.this, deatailactivity.class);
                objIntent.putExtra("Head", title1Strings[position]);
                objIntent.putExtra("Image",intIcon[position]);
                objIntent.putExtra("Position",position);

                startActivity(objIntent);

            }
        });


    }


    private void buttoncontroller() {
        abouttimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
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


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Modela Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://reuse.chon.retraffic/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Modela Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://reuse.chon.retraffic/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
} // Main Class
