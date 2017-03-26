package jp.techacademy.inoue.yuuta.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human yuta= new Human("ゆうた",21,"仕事");

        yuta.say();
        yuta.think();
    }
}


