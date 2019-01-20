package lco.kumarsameer396.com.lco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class signup extends AppCompatActivity {

     ImageView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        login = (ImageView)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();

            }
        });
    }
    public void openMain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
