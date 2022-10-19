package com.solera.persistnotes2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;




class NoteListDAOTests {

	@Test
	void showList_CallIt_returnsArray() {

		NoteList noteList = new NoteList();
		NoteListDAO accessNoteList = new NoteListDAO(noteList);

		List<Note> ExpectedList = new ArrayList<>();



		for (int i=0;i<noteList.getNoteList().size();i++)
			ExpectedList.add(noteList.getNoteList().get(i));
		//Passed
		assertEquals(ExpectedList, accessNoteList.showNoteList(),"Test of ShowList function. Expected result: full list");;



	}
	//Test the result for a given ID parameter
	@Test
	public void showNoteById_IdIsGiven_ReturnsOneNote() {

		NoteList noteList = new NoteList();
		NoteListDAO accessNoteList = new NoteListDAO(noteList);

		List<Note> ExpectedList = new ArrayList<>();



		for (int i=0;i<noteList.getNoteList().size();i++)
			ExpectedList.add(noteList.getNoteList().get(i));
		//Passed

		Note ExpectedfoundNote1= ExpectedList.stream().filter(nota ->nota.id==1 ).findFirst().get();
		Note ExpectedfoundNote2= ExpectedList.stream().filter(nota ->nota.id==2 ).findFirst().get();

		assertEquals(ExpectedfoundNote1, accessNoteList.showNoteById(1),"Test of ShowList function. Expected result: full list");
		assertEquals(ExpectedfoundNote2, accessNoteList.showNoteById(2),"Test of ShowList function. Expected result: full list");;
	}

	@Test
	public void addNote_InsertParams_ReturnsNewNoteCreated() {


		List<Note> noteList = new ArrayList<>();
		NoteListDAO accessNoteList = new NoteListDAO(noteList);
		int id=0;

		for (int i=0;i<4;i++)
			noteList.add(new Note(id++, new Date(),"Descripcion"+i,"Texto"+i,
					"www.link"+i+".com","@user"+1,10*i, new Date(), new Date()));


		Note newAddedNote = noteList.addNote(new Date(),"Descripcion","Texto","www.link.com","@user"+1,10, new Date(), new Date());


		assertEquals(,newAddedNote);
	}







}
