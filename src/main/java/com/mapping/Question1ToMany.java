package com.mapping;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1ToMany {

	@Id
	private int que_Id;

	private String question;

	@OneToMany(mappedBy="question",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	//yesle garda new table create hunthyo jasma queid ra ans id hunthyo so mappedBy="question"
	private List<Answers> answers;

	public Question1ToMany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question1ToMany(int que_Id, String question, List<Answers> answers) {
		super();
		this.que_Id = que_Id;
		this.question = question;
		this.answers = answers;
	}

	public int getQue_Id() {
		return que_Id;
	}

	public void setQue_Id(int que_Id) {
		this.que_Id = que_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

}
