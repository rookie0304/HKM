package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        Button normalBtn = findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("msg","data from SecondActivity");
                setResult(RESULT_OK,intent);
                finish();
                Intent intent1 = new Intent(MainActivity.this, NormalActivity.class);

                startActivity(intent1);
                Intent intent2 = new Intent(MainActivity.this,MainActivity.class);
                startActivityForResult(intent,1);

                Intent intent3 =new Intent();
                intent.putExtra("data","Hello MainActivty");

            }
        });


    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MinActivity","调用onResume()");

    }
    @Override
    protected  void  onResume(){
        super.onResume();
        Log.i("MinActivity","调用onPause()");

    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.i("MinActivity","调用onPause()");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MinActivity","调用onStop()");


    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MinActivity","调用onDestroy()");


    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MinActivity","调用onRestart()");
    }

}

