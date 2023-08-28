package com.example.learnenglishusingaudiocards;

import java.io.File;
import javazoom.jl.player.Player;
public class TrackPlayerCurrentPlaylist {

    public static void main(String[] args) {
        try {
            File file = new File("song.mp3");
            Player player = new Player(new FileInputStream(file));
            player.play();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
