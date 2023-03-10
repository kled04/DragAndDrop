package com.example.draganddrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipDescription;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnDragListener, View.OnLongClickListener {
    private TextView t;
    private Button b;
    private ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t =(TextView) findViewById(R.id.txt1);
        i =(ImageView) findViewById(R.id.imm);
        b=(Button) findViewById(R.id.btnDrag);
        implementaEventi();

        private void implementaEventi()
        {
            t.setOnLongClickListener(this);
            i.setOnLongClickListener(this);
            b.setOnLongClickListener(this);

            findViewById(R.id.layout1).setOnDragListener(this);
            findViewById(R.id.layout2).setOnDragListener(this);
            findViewById(R.id.layout3).setOnDragListener(this);
        }
    }


    @Override
    public boolean onLongClick(View view) {
        return false;
    }

    @Override
    public boolean onDrag(View view, DragEvent event) {
        int action = event.getAction();
        switch(action)
        {
            case DragEvent.ACTION_DRAG_STARTED:
                if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))
                {
                    return true;
                }
                else
                {
                    return false;
                }


        }
        return false;
    }
}