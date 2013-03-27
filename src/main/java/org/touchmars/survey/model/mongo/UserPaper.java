package org.touchmars.survey.model.mongo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserPaper extends AbstractDocument {

	@Indexed
	private BigInteger userId;
	@DBRef
	private SurveyPaper surveyPaper;
	@DBRef
	private List<SurveyAnswer> answers;
	
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public SurveyPaper getSurveyPaper() {
		return surveyPaper;
	}
	public void setSurveyPaper(SurveyPaper surveyPaper) {
		this.surveyPaper = surveyPaper;
	}
	public List<SurveyAnswer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<SurveyAnswer> answers) {
		this.answers = answers;
	}
	
	
}
