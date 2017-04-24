package nz.co.huntsafe.anzinternapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton bExplore,bEvents,bRegister,bWall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bExplore = (ImageButton) findViewById(R.id.bExplore);
        bEvents = (ImageButton) findViewById(R.id.bEvents);
        bWall = (ImageButton) findViewById(R.id.bWall);
        bRegister = (ImageButton) findViewById(R.id.bRegister);

        bExplore.setOnClickListener(this);
        bEvents.setOnClickListener(this);
        bWall.setOnClickListener(this);
        bRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bExplore:

                startActivity(new Intent(this, exploreHomeActivity.class));

                break;

            case R.id.bEvents:
                startActivity(new Intent(this, eventsActivity.class));
                break;
            case R.id.bRegister:
                startActivity(new Intent(this, registerActivity.class));
                break;
            case R.id.bWall:
                startActivity(new Intent(this, wallActivity.class));
                break;
        }
    }


}