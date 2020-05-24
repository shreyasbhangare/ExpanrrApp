package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homeactivity);
        logoLauncher l=new logoLauncher();
        l.start();

    }

    private class logoLauncher extends Thread{

        public void run() {
            try {
                sleep(2000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            Intent intent=new Intent(Homeactivity.this,MainActivity.class);
            startActivity(intent);
            Homeactivity.this.finish();
        }
    }

}
