package com.scrum.evae.metier.impl;

import java.util.List;

import com.scrum.evae.dao.QuestionDAO;
import com.scrum.evae.metier.QuestionMetier;
import com.scrum.evae.metier.model.Question;

public class QuestionMetierImpl implements QuestionMetier{

	
	private QuestionDAO questionDAO;
	
	public void setRubriqueDao(QuestionDAO questionDAO) {
		this.questionDAO =questionDAO;
	}
	
	@Override
	public List<Question> listQuestions() {
		return questionDAO.getQuestions();
	}

	@Override
	public int AjouterQuestion(int idEvaluation,int idQuestion) {
		return questionDAO.ajouterQuestionEvaluation(idEvaluation, idQuestion);
	  
	}


	@Override
	public boolean RetirerQuestion(int idQuestionEvaluation) {
	    return questionDAO.retirerQuestionEvaluation(idQuestionEvaluation);

	}
	
}
