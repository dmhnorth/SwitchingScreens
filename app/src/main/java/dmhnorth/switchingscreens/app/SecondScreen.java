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

        //get the result of the key value pair "CallingActivity"
        String previousActivity = activityThatCalled.getExtras().getString("callingActivityName");



        //Find the TextView we want to display our name on
        TextView callingActivityMessage = (TextView) findViewById(R.id.calling_activity_info_text_view);

        //Set the TextView with the data you have passed across
        callingActivityMessage.append(" " + previousActivity);

    }

    public void onSendUsersName(View view) {

        //find the EditText the user enters the name into
        EditText usersNameEditText = (EditText) findViewById(R.id.users_name_edit_text);

        //get the userName that has been typed in
        String usersName = String.valueOf(usersNameEditText.getText());

        //create a new intent to go back to the previous activity
        Intent goingBack = new Intent();

        //put an extra (key-value) in with the intent to carry back
        goingBack.putExtra("UsersName", usersName);

        //result set by the activity executing. RESULT_CANCELLED is an error handling feature if
        //this activity were to fail for any reason
        setResult(RESULT_OK, goingBack);

        //close the activity
        finish();

    }
}
