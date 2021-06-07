package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    //1.  Album
    //-  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    //-  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    //-  addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean. Returns true if the song was added successfully or false otherwise.
    public boolean addSong(String titleOfSong, double durationOfSong) {
        Song song = findSong(titleOfSong);
        if (song != null) {
            System.out.println("Song already added to album.");
            return false;
        } else {
            this.songs.add(new Song(titleOfSong, durationOfSong));
            System.out.println("Song added to" + this.songs + " album.");
            return true;
        }
    }

    //-  findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists, null if it doesn't exists.
    private Song findSong(String titleOfSong) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(titleOfSong)) {
                return song;
            }
        }
        return null;
    }

    private Song findSong(LinkedList<Song> playlist, String titleOfSong) {
        for (Song song : playlist) {
            if (song.getTitle().equals(titleOfSong)) {
                return song;
            }
        }
        return null;
    }

    //-  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist)
    // that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.
    public boolean addToPlayList(int trackNumberOfSongInAlbum, LinkedList<Song> playlist) {
        int AlbumMaxIndex = (this.songs.size() - 1);
        if (trackNumberOfSongInAlbum > AlbumMaxIndex) {
            System.out.println("Song does not exist.");
            return false;
        }

        Song song = this.songs.get(trackNumberOfSongInAlbum);

        if (song == null) {
            System.out.println("Song doesn't exist in this album.");
            return false;

        } else if (playlist.isEmpty()) {
            playlist.add(song);
            System.out.println("Song added to playlist.");
            return true;

        } else {
            for (int i = 0; i < playlist.size(); i++) {
                if (playlist.get(i).getTitle().equals(song.getTitle())) {
                    System.out.println("Song has already been added to playlist.");//In this instance, duplicate songs cannot be added.
                    return false;
                } else {
                    playlist.add(song);
                    System.out.println("Song added to playlist.");
                }
            }
        }
        return true;
    }

    //-  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
    // Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
    public boolean addToPlayList(String titleOfSong, LinkedList<Song> thePlaylist) {

        Song song = findSong(titleOfSong);
        if (song == null) {
            System.out.println("Song does not exist.");
            System.out.println("Song not added.");
            return false;
        } else {
            for (int i = 0; i < thePlaylist.size(); i++) {
                if (thePlaylist.get(i).getTitle().equals(song.getTitle())) {
                    System.out.println("Song has already been added to playlist.");//In this instance, duplicate songs cannot be added.
                    return false;
                } else
                    thePlaylist.add(song);
                System.out.println("Song added to playlist.");
            }
        }
        return true;
    }


}
