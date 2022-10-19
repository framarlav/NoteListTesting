package com.solera.persistnotes2;

public class NoteListDAO {
    NoteList noteList;

    public NoteListDAO(NoteList noteList){
        this.noteList=noteList;
    }

    public void showNoteList(){
        for (int i=0;i<noteList.getNoteList().size();i++)
            System.out.println(noteList.getNoteList().get(i).toString());
    }
}
