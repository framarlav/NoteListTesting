package com.solera.persistnotes2;

import jakarta.annotation.PostConstruct;
import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.rsocket.RSocketProperties;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

@SpringBootApplication
public class PersistNotes2Application {

	public static void main(String[] args) {
		NoteList noteList = new NoteList();
		NoteListDAO accessNoteList = new NoteListDAO(noteList);

		System.out.println(accessNoteList.showNoteList());
	}

}
