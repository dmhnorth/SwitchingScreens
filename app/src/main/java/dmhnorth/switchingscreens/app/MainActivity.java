package dmhnorth.switchingscreens.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onGetNameClick(View view) {

        Intent getNameScreenIntent = new Intent(this,
                SecondScreen.class);


        //required to reference data that returns
        final int result = 1;

        //for passing extra information into the next activity we call
        getNameScreenIntent.putExtra("callingActivity","MainActivity");

        //use startActivity(Intent) if no results are expected to come back
        startActivityForResult(getNameScreenIntent, result);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView usersNameMessage = (TextView)
                findViewById(R.id.users_name_message);

        String nameSentBack = data.getStringExtra("UsersName");

        usersNameMessage.append(" " + nameSentBack);

    }
}
