package com.example.val.wikint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alexisblervaque on 24/11/2017.
 */

public class AssociationDetail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.association_detail_layout);

        Bundle bundle = getIntent().getBundleExtra("Association");
        Association asso = bundle.getParcelable("Asso");


        Button button2 = (Button) findViewById(R.id.button_event);

        Button button = (Button) findViewById(R.id.button_photos);
    }
}
