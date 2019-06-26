package com.example.katsavvebanav;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

    int price = 0;
    boolean priceUpdate_hagasha = false;
    boolean update_addition = false;

    Button slctDshBtn;
    LinearLayout picLayout;
    TextView detailsEt;
    RadioGroup hagashaGroup;            // רדיו הגשה
    RadioGroup additionGroup;           // רדיו תוספת חמה 1
    RadioGroup addition2Group;          // רדיו תוספת חמה 2
    RelativeLayout hagashaLayout;
    LinearLayout additionLayout;
    RelativeLayout addition2_RLayout;
    CheckBox hot_addition;
    Button continueBtn;
    TextView hello_Name;
    EditText name_Et;
    Button rice_button2;
    Button bean_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {   // תחילת onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        slctDshBtn = (Button) findViewById(R.id.slct_dish);
        picLayout = (LinearLayout) findViewById(R.id.pic_layout);
        detailsEt = findViewById(R.id.details_Et);
        hagashaGroup = findViewById(R.id.hagasha_group);
        additionGroup = findViewById(R.id.hotAddition_group);
        addition2Group = findViewById(R.id.hotAddition2_group);
        hagashaLayout = findViewById(R.id.hagasha_Rlayout);
        hot_addition = (CheckBox) findViewById(R.id.hot_addition);
        continueBtn = findViewById(R.id.continueBtn);
        hello_Name = findViewById(R.id.hello_Name);

        rice_button2 = findViewById(R.id.rice2_button);
        bean_button2 = findViewById(R.id.bean2_button);

        final String enterName = getIntent().getStringExtra("name");
        String hello = getString(R.string.helloName);
        hello_Name.setText(hello + " " + enterName);


        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (priceUpdate_hagasha) {
                    if (!update_addition) {
                        Toast.makeText(SecondActivity.this, R.string.plsSelectHotAdd, Toast.LENGTH_SHORT).show();
                    }
                    else {
                        String totalP = Integer.toString(price);
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        intent.putExtra("price", totalP);
                        startActivity(intent);
                    }
                }
                else {
                    String totalP = Integer.toString(price);
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("price", totalP);
                    startActivity(intent);
                }
            }
        });

        hot_addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (hot_addition.isChecked()) {
                    addition2Group.setVisibility(View.VISIBLE);
                    addition2Group.clearCheck();
                    priceUpdate_hagasha = true;
                    update_addition = false;
                    price += 5;
                } else if (!hot_addition.isChecked()) {
                    addition2Group.setVisibility(View.INVISIBLE);
                    priceUpdate_hagasha = false;
                    update_addition = false;
                    price -= 5;
                    Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                }
            }

        });

    }       // סיום onCreate


    public void selectDish(final View view) {       // תחילת תפריט SelectDish
        PopupMenu popupMenu = new PopupMenu(SecondActivity.this, slctDshBtn);
        popupMenu.getMenuInflater().inflate(R.menu.dish_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override

            public boolean onMenuItemClick(MenuItem item) {
                hagashaGroup.clearCheck();
                additionGroup.clearCheck();
                hot_addition.setChecked(false);
                addition2Group.clearCheck();
                //scrollForSalads.setVisibility(View.VISIBLE);
                hot_addition.setVisibility(View.INVISIBLE);
                addition2Group.setVisibility(View.INVISIBLE);
                price = 0;
                priceUpdate_hagasha = false;
                update_addition = false;

                switch (item.getItemId()) {

                    case R.id.shawarma: {
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        hagashaGroup.setVisibility(View.INVISIBLE);
                        additionGroup.setVisibility(View.INVISIBLE);
                        hot_addition.setVisibility(View.INVISIBLE);
                        addition2Group.setVisibility(View.INVISIBLE);

                        picLayout.setBackgroundResource(R.drawable.shawarm);
                        detailsEt.setText(R.string.details_shawarma);
                        hagashaGroup.setVisibility(View.VISIBLE);
                        price += 47;
                        break;
                    }

                    case R.id.kabab: {
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        hagashaGroup.setVisibility(View.INVISIBLE);
                        additionGroup.setVisibility(View.INVISIBLE);
                        hot_addition.setVisibility(View.INVISIBLE);
                        addition2Group.setVisibility(View.INVISIBLE);

                        picLayout.setBackgroundResource(R.drawable.kab);
                        detailsEt.setText(R.string.details_kabab);
                        hagashaGroup.setVisibility(View.VISIBLE);
                        price += 45;
                        break;
                    }

                    case R.id.levavot: {
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        hagashaGroup.setVisibility(View.INVISIBLE);
                        additionGroup.setVisibility(View.INVISIBLE);
                        hot_addition.setVisibility(View.INVISIBLE);
                        addition2Group.setVisibility(View.INVISIBLE);

                        picLayout.setBackgroundResource(R.drawable.lev);
                        detailsEt.setText(R.string.details_Levavot);
                        hagashaGroup.setVisibility(View.VISIBLE);

                        price += 42;
                        break;
                    }

                    case R.id.pargit: {
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        hagashaGroup.setVisibility(View.INVISIBLE);
                        additionGroup.setVisibility(View.INVISIBLE);
                        hot_addition.setVisibility(View.INVISIBLE);
                        addition2Group.setVisibility(View.INVISIBLE);

                        picLayout.setBackgroundResource(R.drawable.pargit);
                        detailsEt.setText(R.string.details_Pargit);

                        additionGroup.setVisibility(View.VISIBLE);
                        price += 55;
                        break;
                    }

                    case R.id.keves: {
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        hagashaGroup.setVisibility(View.INVISIBLE);
                        additionGroup.setVisibility(View.INVISIBLE);
                        hot_addition.setVisibility(View.INVISIBLE);
                        addition2Group.setVisibility(View.INVISIBLE);
                        picLayout.setBackgroundResource(R.drawable.keves);
                        detailsEt.setText(R.string.details_Keves);

                        additionGroup.setVisibility(View.VISIBLE);
                        price += 65;
                        break;
                    }

                    case R.id.antrikot: {
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        hagashaGroup.setVisibility(View.INVISIBLE);
                        additionGroup.setVisibility(View.INVISIBLE);
                        hot_addition.setVisibility(View.INVISIBLE);
                        addition2Group.setVisibility(View.INVISIBLE);
                        picLayout.setBackgroundResource(R.drawable.antrikot);
                        detailsEt.setText(R.string.details_Antrikot);

                        additionGroup.setVisibility(View.VISIBLE);
                        price += 80;
                        break;
                    }
                }
                return true;

            }
        });

        popupMenu.show();


        hagashaGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {   // תחילת רדיו הגשה
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                hot_addition.setVisibility(View.INVISIBLE);
                addition2Group.setVisibility(View.INVISIBLE);

                hot_addition.setChecked(false);
                addition2Group.clearCheck();
                switch (checkedId) {

                    case R.id.tsalahat_button: {
                        continueBtn.setVisibility(View.VISIBLE);
                        hot_addition.setVisibility(View.VISIBLE);
                        if (hot_addition.isChecked() == true) {
                            addition2Group.setVisibility(View.VISIBLE);
                            priceUpdate_hagasha = true;
                            price += 5;
                        }
                        break;
                    }

                    case R.id.laffa_button: {
                        continueBtn.setVisibility(View.VISIBLE);
                        //visible next
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        //visible next
                        break;
                    }

                    case R.id.pitta_button: {
                        continueBtn.setVisibility(View.VISIBLE);
                        if (priceUpdate_hagasha) {
                            price -= 5;
                            priceUpdate_hagasha = false;
                            update_addition = false;
                            Toast.makeText(SecondActivity.this, R.string.cancele_tsalahat, Toast.LENGTH_SHORT).show();
                        }

                        //visible next
                        break;
                    }

                }
            }
        });        // סיום רדיו הגשה


       additionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId)
               {
                   case R.id.rice_button: {
                       continueBtn.setVisibility(View.VISIBLE);
                       break;
                   }
                   case R.id.bean_button: {
                       continueBtn.setVisibility(View.VISIBLE);
                       break;
                   }

               }
           }
       });


                addition2Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {           // תחילת רדיו הגשה עם צלחת
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.rice2_button: {
                                update_addition = true;
                                break;
                            }
                            case R.id.bean2_button: {
                                update_addition = true;
                                break;
                            }
                        }

                    }
                });         // סיום רדיו הגשה עם צלחת


    }   // סגירת תפריט SelectDish

}
