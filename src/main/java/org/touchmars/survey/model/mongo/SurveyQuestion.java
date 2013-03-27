/**
 * 
 */
package org.touchmars.survey.model.mongo;

import java.util.Map;

import javax.validation.constraints.Min;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author John Cao
 *
 */
@Document
public class SurveyQuestion extends AbstractDocument {

	@DBRef
	private SurveyPaper surveyPaper;
	
	@Min(1)
	private int seqId;
	
	@Field("question_statement")
	private String questionStatement;
	
	private Map<Integer, QuestionSelection> selections;
	
	private boolean multipleChoice = false;
	private boolean commentable = false;
	private ActivePeriod activePeriod;
	
	public int getSeqId() {
		return seqId;
	}
	public String getQuestionStatement() {
		return questionStatement;
	}
	public boolean isMultipleChoice() {
		return multipleChoice;
	}
	public boolean isCommentable() {
		return commentable;
	}
	public ActivePeriod getActivePeriod() {
		return activePeriod;
	}	
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}
	public void setQuestionStatement(String questionStatement) {
		this.questionStatement = questionStatement;
	}
	public void setMultipleChoice(boolean multipleChoice) {
		this.multipleChoice = multipleChoice;
	}
	public void setCommentable(boolean commentable) {
		this.commentable = commentable;
	}
	public void setActivePeriod(ActivePeriod activePeriod) {
		this.activePeriod = activePeriod;
	}
	public Map<Integer, QuestionSelection> getSelections() {
		return selections;
	}
	public void setSelections(Map<Integer, QuestionSelection> selections) {
		this.selections = selections;
	}
	public SurveyPaper getSurveyPaper() {
		return surveyPaper;
	}
	public void setSurveyPaper(SurveyPaper surveyPaper) {
		this.surveyPaper = surveyPaper;
	}
	
}
