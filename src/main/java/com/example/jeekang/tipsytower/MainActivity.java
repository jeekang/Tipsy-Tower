package com.example.jeekang.tipsytower;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    JengaTiles game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new JengaTiles();
    }
    public void sendMessage(View view) {

       /* if (view.getId() == R.id.btnNext) {

            MessageBox(game.returnRule());
        }*/
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle("May the odds be ever in your favor.");
        builder1.setMessage(game.returnRule());
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Done!",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "New Game?",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        game.newGame();
                        game = new JengaTiles();
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }

    public void MessageBox(String message)
        {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }

    }


