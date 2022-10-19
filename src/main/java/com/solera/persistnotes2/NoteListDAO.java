package com.solera.persistnotes2;

import java.util.ArrayList;
import java.util.Date;
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
    public Note showNoteById(int id){
        return noteList.getNoteList().stream().filter(i -> i.id==id).findFirst().get();
    }

    public Note addNote(String text, String link, String mentions, String description, int priority, Date date_est_completion, Date date_creation ){
        noteList.setId();
        Note newNote = new Note(noteList.getId(), text, link, mentions, description, priority, date_est_completion, date_creation);
        noteList.getNoteList().add(newNote);

        return newNote;
    }
}
