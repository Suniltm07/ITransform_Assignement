package com.capg.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Answers 
{
	List<String> AnswersList;
	Set<String>  AnswersSet;
	Map<Integer,String>  AnswersMap;
	
	public Answers() {
		// TODO Auto-generated constructor stub
	}

	public Answers(List<String> answersList, Set<String> answersSet, Map<Integer, String> answersMap) {
		super();
		AnswersList = answersList;
		AnswersSet = answersSet;
		AnswersMap = answersMap;
	}

	public List<String> getAnswersList() {
		return AnswersList;
	}

	public void setAnswersList(List<String> answersList) {
		AnswersList = answersList;
	}

	public Set<String> getAnswersSet() {
		return AnswersSet;
	}

	public void setAnswersSet(Set<String> answersSet) {
		AnswersSet = answersSet;
	}

	public Map<Integer, String> getAnswersMap() {
		return AnswersMap;
	}

	public void setAnswersMap(Map<Integer, String> answersMap) {
		AnswersMap = answersMap;
	}

	@Override
	public String toString() {
		return "Answers [AnswersList=" + AnswersList + ", AnswersSet=" + AnswersSet + ", AnswersMap=" + AnswersMap
				+ "]";
	}
}
