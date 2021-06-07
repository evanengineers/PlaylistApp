package com.company;

import java.util.ArrayList;

public class Albums {

    private ArrayList<Album> albums;

    public Albums() {
        this.albums = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public Album get(int index) {
        return this.albums.get(index);
    }


    public boolean add(Album album){
        if(this.albums.isEmpty()) {
            System.out.println("Album added successfully.");
            this.albums.add(album);
            return true;
        }else {
            for(int i = 0; i < this.albums.size();i++) {
                if(this.albums.get(i).getName().equals(album.getName())) {
                    System.out.println("Album is already added to collection.");
                    return false;
                }else {
                    this.albums.add(album);
                    System.out.println("Album added successfully.");
                }
            }
        }
        return true;
    }
}
