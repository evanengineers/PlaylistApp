package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Albums albumCollection = new Albums();
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albumCollection.add(album);
        Album album2 = new Album("For those about to rock", "AC/DC");
        album2.addSong("For those about to rock", 5.44);
        album2.addSong("I put the finger on you", 3.25);
        album2.addSong("Lets go", 3.45);
        album2.addSong("Inject the venom", 3.33);
        album2.addSong("Snowballed", 4.51);
        album2.addSong("Evil walks", 3.45);
        album2.addSong("C.O.D.", 5.25);
        album2.addSong("Breaking the rules", 5.32);
        album2.addSong("Night of the long knives", 5.12);
        albumCollection.add(album2);
        LinkedList<Song> playList = new LinkedList<Song>();
        albumCollection.get(0).addToPlayList("You can't do it right", playList);
        albumCollection.get(0).addToPlayList("Holy man", playList);
        albumCollection.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albumCollection.get(0).addToPlayList(9, playList);
        albumCollection.get(1).addToPlayList(3, playList);
        albumCollection.get(1).addToPlayList(2, playList);
        albumCollection.get(1).addToPlayList(24, playList);  // There is no track 24


        //TIP:  In Album, use the findSong() method in addSong() and addToPlayList(String, LinkedList) to check if a song exists before proceeding.
        //TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
        //TIP:  Be extremely careful about spaces and spelling in the returned String from the toString() method.
        //NOTE:  All fields are private.
        //NOTE:  All constructors are public.
        //NOTE:  All methods are public (except for findSong() which is private).
        //NOTE:  There are no static members.
        //NOTE:  Do not add a main method to the solution code.
        //NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.
    }
}
