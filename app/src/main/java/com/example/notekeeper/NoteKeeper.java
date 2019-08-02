package com.example.notekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

public class NoteKeeper extends AppCompatActivity {
    public static final String NOTE_POSITION = "com.example.notekeeper.NOTE_POSITION";
    public static final int POSITION_NOT_SET = -1;
    private boolean isNewNote;
    private NoteInfo mnote;
    private Spinner mspinner_course;
    private EditText mtextTitle;
    private EditText mtextName;
    private boolean misCancelling;
    private int mnotePosition;
    private int mnotePosition1;
    private String moriginalNoteCourseId;
    private String moriginalNoteTitle;
    private boolean misCanceling;


    @Override
    protected void onPause() {
        super.onPause();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        mspinner_course = (Spinner) findViewById(R.id.spinner_course);
        EditText mtextTitle = (EditText)  findViewById(R.id.textTitle);
        EditText mtextName = (EditText)  findViewById(R.id.textName);

        List<CourseInfo> courses = DataManager.getInstance().getCourses();
        ArrayAdapter<CourseInfo> adapterCourses =
                new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,courses);
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_item);
        mspinner_course.setAdapter(adapterCourses);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_send_email) {
            sendEmail();
            return true;
        }
        else if(id == R.id.action_cancel){
     //       misCanceling = true;
            finish();
        }
        else if(id == R.id.action_next){
        }

        return super.onOptionsItemSelected(item);
    }



    private void sendEmail() {
//        CourseInfo course = (CourseInfo) mspinner_course.getSelectedItem();
//        String subject = mtextTitle.getText().toString();
//        String text = "Checkout what i learned in the pluralsight course\"" +
//                course.getTitle() + "\"\n" + mtextName.getText().toString();
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("message/rfc2822");
//        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
//        intent.putExtra(Intent.EXTRA_TEXT, text);
//        startActivity(intent);
    }
}
