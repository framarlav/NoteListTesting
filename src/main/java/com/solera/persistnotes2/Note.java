package com.solera.persistnotes2;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Note {

	int id;
	Date date_completion;

	public Note(int id, String text, String link, String mentions, String description, int priority, Date date_est_completion, Date date_creation) {
		this.id = id;
		this.date_completion = null;
		this.text = text;
		this.link = link;
		this.mentions = mentions;
		this.description = description;
		this.priority = priority;
		this.date_est_completion = date_est_completion;
		this.date_creation = date_creation;
	}

	String text;
	String link;
	String mentions;
	String description;
	int priority;
	Date date_est_completion;
	Date date_creation;


	
	public void setDateCompletion() {
		this.date_completion = new Date();
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", date_completion=" + date_completion + ", text=" + text + ", link=" + link
				+ ", mentions=" + mentions + ", description=" + description + ", priority=" + priority
				+ ", date_est_completion=" + date_est_completion + ", date_creation=" + date_creation + "]";
	}

}
