package com.example.katsavvebanav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity {

    CheckBox fries;
    CheckBox hummus;
    CheckBox redCabbage;
    CheckBox tehina;
    CheckBox vegetable;
    CheckBox onion;
    CheckBox amba;
    CheckBox tomato;
    CheckBox greenCabage;
    CheckBox flafel;
    int numOfAddition = 0;
    int price;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.third_activity);

                fries = findViewById(R.id.fries);
                hummus = findViewById(R.id.hummus);
                redCabbage = findViewById(R.id.redCabbage);
                tehina = findViewById(R.id.tehina);
                vegetable = findViewById(R.id.vegetable);
                onion = findViewById(R.id.onion);
                amba = findViewById(R.id.amba);
                tomato = findViewById(R.id.tomato);
                greenCabage = findViewById(R.id.greenCabage);
                flafel = findViewById(R.id.flafel);

                Button continue3Btn;
                continue3Btn = findViewById(R.id.continue3Btn);
                final String totalP = getIntent().getStringExtra("price");
                price = Integer.parseInt(totalP);



                /* --------------------------------------------------------------------------------------------------------*/

                fries.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (fries.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            } else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                fries.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!fries.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                /* --------------------------------------------------------------------------------------------------------*/
                hummus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (hummus.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                hummus.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!hummus.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }

                      }
                });

                /* --------------------------------------------------------------------------------------------------------*/
                redCabbage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (redCabbage.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                });


                redCabbage.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!redCabbage.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                /* --------------------------------------------------------------------------------------------------------*/
                tehina.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (tehina.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                tehina.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!tehina.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                   }
                });

                /* --------------------------------------------------------------------------------------------------------*/

                vegetable.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (vegetable.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                vegetable.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!vegetable.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                /* --------------------------------------------------------------------------------------------------------*/
                onion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onion.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                onion.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!onion.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                /* --------------------------------------------------------------------------------------------------------*/
                amba.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (amba.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                amba.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!amba.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                /* --------------------------------------------------------------------------------------------------------*/
                tomato.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (tomato.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                tomato.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!tomato.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                /* --------------------------------------------------------------------------------------------------------*/
                greenCabage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (greenCabage.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                greenCabage.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!greenCabage.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                /* --------------------------------------------------------------------------------------------------------*/
                flafel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (flafel.isChecked()) {
                            if (numOfAddition < 6) {
                                numOfAddition++;
                            }
                            else {
                                numOfAddition++;
                                price += 2;
                                Toast.makeText(ThirdActivity.this, R.string.plus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });


                flafel .setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (!flafel.isChecked()) {
                            if (numOfAddition < 7) {
                                numOfAddition--;
                            }
                            else {
                                numOfAddition--;
                                price -= 2;
                                Toast.makeText(ThirdActivity.this, R.string.minus2ILS, Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });

                /* --------------------------------------------------------------------------------------------------------*/

                continue3Btn.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String totalP = Integer.toString(price);
                        Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                        intent.putExtra("price", totalP);
                        startActivity(intent);
                    }
                });



    }
}
