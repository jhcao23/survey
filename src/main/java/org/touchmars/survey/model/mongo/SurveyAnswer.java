package org.touchmars.survey.model.mongo;

import javax.validation.constraints.Min;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class SurveyAnswer extends AbstractDocument {

	@DBRef
	private SurveyQuestion surveyQuestion;	
	@Min(1)
	private int score;
	private String comment;

	public SurveyQuestion getSurveyQuestion() {
		return surveyQuestion;
	}

	public int getScore() {
		return score;
	}

	public void setSurveyQuestion(SurveyQuestion question) {
		this.surveyQuestion = question;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
