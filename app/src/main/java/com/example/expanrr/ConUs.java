package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConUs extends AppCompatActivity {

    Button submit;
    EditText name;
    EditText email;
    EditText phone;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_us);

        submit=findViewById(R.id.btnSubmit);
        name=findViewById(R.id.ETName);
        email=findViewById(R.id.ETEmail);
        phone=findViewById(R.id.ETphone);
        message=findViewById(R.id.ETmess);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate())
                {
                    Toast.makeText(ConUs.this,"Submitted successfully",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ConUs.this,"Recheck your entered Details",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean validate() {
        if(name.getText().toString().isEmpty())
        {
            name.setError("This field should not be empty");
            return false;
        }
        else if(email.getText().toString().isEmpty())
        {
            email.setError("This field should not be empty");
            return false;
        }
        else if (phone.getText().toString().isEmpty())
        {
            phone.setError("This field should not be empty");
            return false;
        }
        else if (message.getText().toString().isEmpty())
        {
            message.setError("This field should not be empty");
            return false;
        }
        else
        {
            name.setError(null);
            email.setError(null);
            phone.setError(null);
            message.setError(null);
            return true;
        }
    }

}
