package com.reza.minitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPublish;
    TextView tvNama;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPublish = findViewById(R.id.btn_publish);
        tvNama = findViewById(R.id.tv_nama);
        etNama = findViewById(R.id.et_nama);

        btnPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etNama.getText().toString();

                if (Nama.trim().equals("")) {
                    etNama.setError("Tidak Boleh Kosong");
                }
                else {
                    tvNama.setText(Nama);
                }
            }
        });
    }
}