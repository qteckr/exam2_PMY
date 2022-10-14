package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button m_btn_menu1;
    private Button m_btn_menu2;
    private Button m_btn_menu3;
    private Button m_btn_menu4;
    private Button m_btn_menu5;

    private TextView m_tv_label;
    private ListView m_lv_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        m_btn_menu1 = (Button) findViewById(R.id.btn_menu_1);
        m_btn_menu2 = (Button) findViewById(R.id.btn_menu_2);
        m_btn_menu3 = (Button) findViewById(R.id.btn_menu_3);
        m_btn_menu4 = (Button) findViewById(R.id.btn_menu_4);
        m_btn_menu5 = (Button) findViewById(R.id.btn_menu_5);

        m_tv_label = (TextView) findViewById(R.id.tv_label);
        m_lv_listview = (ListView) findViewById(R.id.lv_listview);

        m_btn_menu1.setOnClickListener(this);
        m_btn_menu2.setOnClickListener(this);
        m_btn_menu3.setOnClickListener(this);
        m_btn_menu4.setOnClickListener(this);
        m_btn_menu5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}