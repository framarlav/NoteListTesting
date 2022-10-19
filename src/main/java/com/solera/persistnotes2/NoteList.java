package com.solera.persistnotes2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteList {
    List<Note> noteList = new ArrayList<>();
    public int id=0;

    public NoteList(){
        for (int i=0;i<4;i++)
            noteList.add(new Note(id++,"Descripcion"+i,"Texto"+i,
                    "www.link"+i+".com","@user"+1,10*i, new Date(), new Date()));
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id++;
    }

}
