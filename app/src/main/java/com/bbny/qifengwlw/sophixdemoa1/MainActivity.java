package com.bbny.qifengwlw.sophixdemoa1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast.makeText(this, "添加了点击效果"+Student.name+":"+Student.age, Toast.LENGTH_SHORT).show();
    }


    public void toNextActivity(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
