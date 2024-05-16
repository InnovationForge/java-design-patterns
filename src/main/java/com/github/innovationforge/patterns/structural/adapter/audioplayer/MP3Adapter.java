package com.github.innovationforge.patterns.structural.adapter.audioplayer;

// Adapter for MP3
class MP3Adapter implements AudioPlayer {
    private final MP3Player mp3Player;

    MP3Adapter(MP3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void play(String track) {
        mp3Player.playMP3(track);
    }
}