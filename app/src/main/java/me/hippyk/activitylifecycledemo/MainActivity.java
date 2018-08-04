package me.hippyk.activitylifecycledemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = "ActivityDemo";


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setTitle("普通对话框")
                        .setNegativeButton("取消", null).setPositiveButton("确定", null)
                        .setMessage("").create();
                dialog.show();
            }
        });

        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.bt3).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
        
        findViewById(R.id.bt4).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onCreate~~~");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onStart~~~");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onRestart~~~");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onResume~~~");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onPause~~~");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onStop~~~");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onDestroy~~~");
    }
}
