package com.example.sunjae.butterknife_ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //BindView, injectView로 View처리 가능
    //Resource Bind도 가능
    //@BindString, BindBool, BindDrawble 등등
    @BindView(R.id.btn_1) Button btn1;
    @BindView(R.id.btn_2) Button btn2;
    @BindView(R.id.btn_3) Button btn3;
    @BindView(R.id.btn_4) Button btn4;
    @BindView(R.id.btn_5) Button btn5;
    @BindView(R.id.textView) TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind, inject 모두 동일 기능
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btn_1) public void ButtonClick(){
        Toast.makeText(MainActivity.this,"버튼 1번",Toast.LENGTH_SHORT).show();
    }
    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5})
    public void onClickButton(View view){
        tv.setText(((Button)view).getText());
    }
}
