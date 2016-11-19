package com.example.android.futebolcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAGols = 0;
    int teamBGols = 0;
    int teamAFaltas = 0;
    int teamBFaltas = 0;
    int teamAPenaltis = 0;
    int teamBPenaltis = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addGolForTeamA(View v) {
        teamAGols = teamAGols + 1;
        displayGolForTeamA(teamAGols);
    }

    public void addGolForTeamB(View v) {
        teamBGols = teamBGols + 1;
        displayGolForTeamB(teamBGols);
    }

    public void addFaltaForTeamA(View v) {
        teamAFaltas = teamAFaltas + 1;
        displayFaltaForTeamA(teamAFaltas);
    }

    public void addFaltaForTeamB(View v) {
        teamBFaltas = teamBFaltas + 1;
        displayFaltaForTeamB(teamBFaltas);
    }

    public void addPenaltiForTeamA(View v) {
        teamAPenaltis = teamAPenaltis + 1;
        displayPenaltiForTeamA(teamAPenaltis);
    }

    public void addPenaltiForTeamB(View v) {
        teamBPenaltis = teamBPenaltis + 1;
        displayPenaltiForTeamB(teamBPenaltis);
    }

    public void resetResults(View v) {
        teamAGols = 0;
        teamBGols = 0;
        teamAFaltas = 0;
        teamBFaltas = 0;
        teamAPenaltis = 0;
        teamBPenaltis = 0;
        displayGolForTeamA(teamAGols);
        displayGolForTeamB(teamBGols);
        displayFaltaForTeamA(teamAFaltas);
        displayFaltaForTeamB(teamBFaltas);
        displayPenaltiForTeamA(teamAPenaltis);
        displayPenaltiForTeamB(teamBPenaltis);
    }


    public void displayGolForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_gols);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGolForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_gols);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaltaForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_faltas);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaltaForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_faltas);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltiForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penaltis);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltiForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penaltis);
        scoreView.setText(String.valueOf(score));
    }


}
