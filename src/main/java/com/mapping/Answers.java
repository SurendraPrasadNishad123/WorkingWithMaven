package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {

@Id
private	int ansId;
	
private String answers;

@ManyToOne
private Question1ToMany question;

public Answers() {
	super();
	// TODO Auto-generated constructor stub
}

public Answers(int ansId, String answers, Question1ToMany question) {
	super();
	this.ansId = ansId;
	this.answers = answers;
	this.question = question;
}

public int getAnsId() {
	return ansId;
}

public void setAnsId(int ansId) {
	this.ansId = ansId;
}

public String getAnswers() {
	return answers;
}

public void setAnswers(String answers) {
	this.answers = answers;
}

public Question1ToMany getQuestion() {
	return question;
}

public void setQuestion(Question1ToMany question) {
	this.question = question;
}


}
