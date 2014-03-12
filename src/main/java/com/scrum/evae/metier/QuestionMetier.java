package com.scrum.evae.metier;

import java.util.List;

import com.scrum.evae.metier.model.Question;

public interface QuestionMetier {
	
	List<Question> listQuestions();
	int AjouterQuestion(int idEvaluation,int idQuestion);
	boolean RetirerQuestion(int idQuestionEvaluation);

}
