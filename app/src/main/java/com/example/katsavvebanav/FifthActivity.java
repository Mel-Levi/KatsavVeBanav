package com.example.katsavvebanav;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


import com.example.katsavvebanav.R;

import java.util.ArrayList;

public class FifthActivity extends AppCompatActivity implements finishDialog.MyDialogListener {


    Button submitOrder;
    TextView total;
    LinearLayout rating_Layout;
    RatingBar rating_Bar;
    TextView yourRate;
    Button noteBtn;
    Button finishBtn;
    LinearLayout notes_layout;
    LinearLayout.LayoutParams notes_Params;

    ArrayList<EditText> notesArray;       //note
    int noteLastId = 0;                   //note



    public void onOkBtnClicked() {
       Intent intent = new Intent(this, MainActivity.class);
       startActivity(intent);

        //  Toast.makeText(this, R.string.EnjoyableUse, Toast.LENGTH_SHORT).show();
    }

    final String DIALOG2_FRAGMENT_TAG = "dialog2_fragment";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       requestWindowFeature(Window.FEATURE_NO_TITLE);
       getSupportActionBar().hide();

        setContentView(R.layout.fifth_activity);



        total = findViewById(R.id.totalPrice_show);
        submitOrder = findViewById(R.id.submitOrder_Btn);
        rating_Layout = findViewById(R.id.rating_Layout);
        rating_Bar = findViewById(R.id.rating_Bar);
        yourRate = findViewById(R.id.yourRate);
        noteBtn = findViewById(R.id.noteBtn);
        finishBtn = findViewById(R.id.finishBtn);
        notes_layout = findViewById(R.id.notes_layout);

        notesArray = new ArrayList<>();       //note
        addNotesEditText();                   //note


        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finishDialog dialog2 = new finishDialog();
                dialog2.show(getSupportFragmentManager(), DIALOG2_FRAGMENT_TAG);
                // Toast.makeText(FifthActivity.this, R.string.bonapatite, Toast.LENGTH_LONG).show();

            }

        });

        noteBtn.setOnClickListener(new View.OnClickListener()        //note
        {
            @Override
            public void onClick(View v) {
                addNotesEditText();
            }
        });



            final String totalP = getIntent().getStringExtra("price");
        String ils = getString(R.string.ilsView);
        total.setText(totalP + " " + ils);




        submitOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(FifthActivity.this, R.string.orderSent, Toast.LENGTH_LONG).show();
                rating_Layout.setVisibility(View.VISIBLE);
            }
        });







        rating_Bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
            {
                // float ratingValue = rating_Bar.getRating();
                    String your_Rate = getString(R.string.yourRate);
                    yourRate.setText(your_Rate + " " + (int)rating);
                    noteBtn.setVisibility(View.VISIBLE);
                    finishBtn.setVisibility(View.VISIBLE);
                    notes_layout.setVisibility(View.VISIBLE);
            }
        });
    }



    void addNotesEditText() {


        notes_Params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        EditText editText = new EditText(FifthActivity.this);
        editText.setLayoutParams(notes_Params);
        editText.setHint(getString(R.string.noteHere));
        notes_layout.addView(editText);
        notesArray.add(editText);
    }



}
