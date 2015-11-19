package starbuzz.test.com.starbuzzhdf;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRRINK_NO = "drinkNo";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRRINK_NO);
        Drink drink = Drink.drink[drinkNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        //photo.setImageResource(drink.get_imageResourceId());
        //photo.setContentDescription(drink.get_name());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.get_name());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.get_description());
    }

}
