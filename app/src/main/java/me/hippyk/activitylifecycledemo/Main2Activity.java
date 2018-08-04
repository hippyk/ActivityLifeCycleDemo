package me.hippyk.activitylifecycledemo;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityManager manager = (ActivityManager)getSystemService(ACTIVITY_SERVICE);
                manager.killBackgroundProcesses(getPackageName());
            }
        });
    }
}
