package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import app.first.in.collegeprofiles.R;

public class Tennis extends AppCompatActivity {

    MenuItem item;

    Button people;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tennis_interest);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        people=(Button)findViewById(R.id.people) ;
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxtIntent = new Intent(Tennis.this, Field_Profile.class);
                startActivity(nxtIntent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}