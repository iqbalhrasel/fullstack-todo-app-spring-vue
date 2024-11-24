package com.pxc.todo_rest_jwt.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String description;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate creationDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate targetDate;
	
	private boolean done;
	
	@JsonIgnore
	private String accountUsername;

	public Todo() {
	}

	public Todo(int id, String description, LocalDate creationDate, LocalDate targetDate, boolean done,
			String accountUsername) {
		this.id = id;
		this.description = description;
		this.creationDate = creationDate;
		this.targetDate = targetDate;
		this.done = done;
		this.accountUsername = accountUsername;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getAccountUsername() {
		return accountUsername;
	}

	public void setAccountUsername(String accountUsername) {
		this.accountUsername = accountUsername;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", creationDate=" + creationDate + ", targetDate="
				+ targetDate + ", done=" + done + ", accountUsername=" + accountUsername + "]";
	}

	

}
