package com.example.lawrence.quizapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    // "wiring up widgets" (binding/mapping controller to view) part 1.
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView() inflates a layout (activity_main) and puts it on the screen.
        // With the layout inflated, each widget in the layout file is
        // instantiated as defined by its attributes.
        setContentView(R.layout.activity_main);
        // a layout is a resource (resources are pieces of your application that
        // is not code. examples are: image files, audio files, xml files, etc.)
        // resources are stored in the res directory.
        // you access resources via their resource ID, those values are stored in
        // a file (R.java). It is auto-generated from the XML layout file
        // and hard-codes each resource to a resource ID (a static final int).
        // specifically located at ..\QuizApp\app\build\generated\source\r\debug\com\example\lawrence\quizapp\R.java

        // Also note, in the layout XML file, values prefaced with "@" are
        // used to reference (read-only) ID's while prefaced
        // with "+" are for creating ID's.

        // "wiring up widgets" part 2.
        // get references to an inflated widget by calling findViewById()
        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);

        // adding click listeners for the buttons
        // when an application is waiting for a specific event, it is “listening for” that event.
        // the object that you create to respond to an event is called a listener.
        // a listener is an object that implements a listener interface for that event
        // we create an anonymous inner class to implement this listener.
        // between View.OnClickListener() { ... } you create a new nameless class
        // and pass its entire implementation as a parameter to the setOnClickListener() method.
        // the benefit of implements as an anonymous inner class is that the code you
        // want to happen is close by and there is no overhead compared to named classes
        // because we don't reuse the code inside the anonymous inner class anywhere else in the code.
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //toast message are short notifications that "pop" up at the bottom of the screen.
                // Context is a subclass of Activity, so we pass in MainActivity.this,
                // we can't use the "this" keyword since we're inside an anonymous inner class
                // (i.e. "this" would refer to the View.OnClickListener
                Toast.makeText(MainActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show();

            }
        });

        // we do the same thing with the false button
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
