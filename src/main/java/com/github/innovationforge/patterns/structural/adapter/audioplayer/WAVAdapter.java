package com.github.innovationforge.patterns.structural.adapter.audioplayer;

// Adapter for WAV
class WAVAdapter implements AudioPlayer {
    private final WAVPlayer wavPlayer;

    WAVAdapter(WAVPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void play(String track) {
        wavPlayer.playWAV(track);
    }
}