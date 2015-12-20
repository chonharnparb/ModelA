package reuse.chon.retraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class deatailactivity extends AppCompatActivity {
    //explicit
    private TextView headTextView, detailTextView;
    private ImageView trafficImageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatailactivity);
        //Bind Widget
        bindWidget();

        //Show view
        showView();


    } //Main Method

    private void showView() {
        //Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        //Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        //Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strdetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strdetail[intIndex]);


    }


    private void bindWidget() {
        headTextView = (TextView) findViewById(R.id.textView2);
        trafficImageView = (ImageView) findViewById( R.id.imageView2);
        detailTextView = (TextView) findViewById(R.id.textView3);


    }
} // Main class
