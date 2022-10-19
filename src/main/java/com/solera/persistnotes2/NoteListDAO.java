package com.solera.persistnotes2;

import java.util.ArrayList;
import java.util.List;

public class NoteListDAO {
    NoteList noteList;
    public NoteListDAO(NoteList noteList){
        this.noteList=noteList;
    }
    public List<Note> showNoteList(){
        List<Note> lista= new ArrayList<>();
        for (int i=0;i<noteList.getNoteList().size();i++)
            lista.add(noteList.getNoteList().get(i));
        return lista;
    }
    public void showNoteById(int id){}
}
