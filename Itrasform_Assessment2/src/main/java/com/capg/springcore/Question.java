package com.capg.springcore;

public class Question 
{
	private int questionId;
	private String question;
	private Answers answers;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, Answers answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answers getAnswers() {
		return answers;
	}

	public void setAnswers(Answers answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
}
