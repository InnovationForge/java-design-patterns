package com.github.innovationforge.patterns.structural.adapter.audioplayer;

// Adapter for AIFF
class AIFFAdapter implements AudioPlayer {
    private final AIFFPlayer aiffPlayer;

    AIFFAdapter(AIFFPlayer aiffPlayer) {
        this.aiffPlayer = aiffPlayer;
    }

    @Override
    public void play(String track) {
        aiffPlayer.playAIFF(track);
    }
}