package com.capg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			Question Q = context.getBean("question",Question.class);
			Answers Ans = Q.getAnswers();
			
			System.out.println("Question Number :"+Q.getQuestionId());
			System.out.println("Question :"+Q.getQuestion());
			System.out.println(Ans.getAnswersList());
			System.out.println(Ans.getAnswersSet());
			System.out.println(Ans.getAnswersMap());
					

	}

}
