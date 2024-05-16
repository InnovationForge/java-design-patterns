package com.github.innovationforge.patterns.structural.adapter.audioplayer;

// Usage
public class MusicPlayerApp {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        AudioPlayer mp3Adapter = new MP3Adapter(mp3Player);
        mp3Adapter.play("Song.mp3");

        WAVPlayer wavPlayer = new WAVPlayer();
        AudioPlayer wavAdapter = new WAVAdapter(wavPlayer);
        wavAdapter.play("Song.wav");

        AIFFPlayer aiffPlayer = new AIFFPlayer();
        AudioPlayer aiffAdapter = new AIFFAdapter(aiffPlayer);
        aiffAdapter.play("Song.aiff");
    }
}