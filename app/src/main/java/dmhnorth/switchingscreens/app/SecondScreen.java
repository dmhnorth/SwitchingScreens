package dmhnorth.switchingscreens.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Dave on 28/07/2014.
 */
public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //call layout
        setContentView(R.layout.second_layout);

        //collect Intent data
        Intent activityThatCalled = getIntent();

        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView) findViewById(R.id.calling_activity_info_text_view);

        callingActivityMessage.append(" " + previousActivity);

    }

    public void onSendUsersName(View view) {

//TODO fill details out of how this works
        EditText usersNameET = (EditText) findViewById(R.id.users_name_edit_text);

        String usersName = String.valueOf(usersNameET.getText());

        Intent goingBack = new Intent();

        goingBack.putExtra("UsersName", usersName);

        setResult(RESULT_OK, goingBack);

        finish();

    }
}
