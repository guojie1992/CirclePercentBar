package com.android.tu.circlepercentcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.DecelerateInterpolator;

import com.android.tu.circlelibrary.CirclePercentBar;

public class MainActivity extends AppCompatActivity {

    private CirclePercentBar circlePercentBar,circlePercentBarTwo,circlePercentBarThree,circlePercentBarFour;
    private float isStudySub;
    private int allStudy = 12;
    private float one,two,three,four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circlePercentBar= (CirclePercentBar) findViewById(R.id.circle_bar);
        circlePercentBarTwo= (CirclePercentBar) findViewById(R.id.circle_bar_two);
        circlePercentBarThree= (CirclePercentBar) findViewById(R.id.circle_bar_three);
        circlePercentBarFour= (CirclePercentBar) findViewById(R.id.circle_bar_four);

        isStudySub = (float)(Math.random()*12);
        one = (isStudySub/allStudy*100);
        circlePercentBar.setPercentData(one,new DecelerateInterpolator());
        circlePercentBarTwo.setPercentData((float)((Math.random()*12)/allStudy*100),new DecelerateInterpolator());
        circlePercentBarThree.setPercentData((float) ((Math.random()*12)/allStudy*100),new DecelerateInterpolator());
        circlePercentBarFour.setPercentData((float) ((Math.random()*12)/allStudy*100),new DecelerateInterpolator());

    }
}
