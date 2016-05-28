package com.example.user.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    //속성 값 설정
    Button   btn;
    EditText etName;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("==WELCOMT TO PROGRAM==");

        //선언된 변수의 값 설정
        //변수 연동 후 형변환(Alt Enter)
        btn = (Button) this.findViewById(R.id.btn);
        etName = (EditText)this.findViewById(R.id.etName);
        tvName = (TextView)this.findViewById(R.id.tvName);

        //버튼 액션 리스터
        btn.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tvName.setText(etName.getText().toString()+"님 안녕하세요");
                tvName.setVisibility(View.VISIBLE);
                return false;
            }
        });
    }
}
