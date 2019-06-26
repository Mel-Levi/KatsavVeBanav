package com.example.katsavvebanav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements infoDialog.MyDialogListener {

    EditText name_Et;
    Button informationBtn;
    Button startBtn;

    @Override
    public void onOkBtnClicked() {
        //  Toast.makeText(this, R.string.EnjoyableUse, Toast.LENGTH_SHORT).show();

    }

    final String DIALOG_FRAGMENT_TAG = "dialog_fragment";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startBtn = findViewById(R.id.startBtn);
        informationBtn = findViewById(R.id.informationBtn);
        name_Et = findViewById(R.id.name_Et);

        informationBtn.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                infoDialog dialog = new infoDialog();
                dialog.show(getSupportFragmentManager(), DIALOG_FRAGMENT_TAG);
            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameStr = name_Et.getText().toString();
                if (nameStr.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.noNameEntered, Toast.LENGTH_SHORT).show();
                    return;
                } else if (nameStr.contains(" ")) {
                    Toast.makeText(MainActivity.this, R.string.nonSpaces, Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    String enName = name_Et.getText().toString();
                    intent.putExtra("name", enName);
                    startActivity(intent);
                    }
                }
            });


        }


    }
