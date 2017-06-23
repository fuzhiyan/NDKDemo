package com.bwei.ndkdemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,""+getKey(1),Toast.LENGTH_LONG).show();

//       Field[] fileds=Build.class.getFields();
//        for(int i=0;i<fileds.length;i++){
//
//            fileds[i].setAccessible(true);
//            try {
//                System.out.println(fileds[i].getName()+"filed"+""+fileds[i].get(null).toString());
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
    }
    public native String getKey(int type);
    static {
        System.loadLibrary("str");
    }
}

