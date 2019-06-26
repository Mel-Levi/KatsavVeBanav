package com.example.katsavvebanav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        Button continue4Btn;

        continue4Btn = findViewById(R.id.continue4Btn);
        final String totalP = getIntent().getStringExtra("price");

        continue4Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                intent.putExtra("price", totalP);
                startActivity(intent);
            }
        });

    }
}
