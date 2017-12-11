package com.example.liyuanma.uiwidgetestapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =
                findViewById(R.id.button_1);//this is a view... All the button, text are views
        editText = findViewById(R.id.editText_1);
        imageView = findViewById(R.id.imageView_1);
        progressBar = findViewById(R.id.progressBar_1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /**
         * different behaviors for different views
         */
        switch (v.getId()) {
            case R.id.button_1:
//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
//                imageView.setImageResource(R.drawable.img_2);
//                if (progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
//                int progress = progressBar.getProgress();
//                progress = progress+10;
//                progressBar.setProgress(progress);
//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("This is a Dialog");
//                dialog.setMessage("Something important");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }
//                });
//                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }
//                });
//                dialog.show();
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);//progressDialog.dismiss(); to close the dialog
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
