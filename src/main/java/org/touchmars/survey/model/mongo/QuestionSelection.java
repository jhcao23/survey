package org.touchmars.survey.model.mongo;

import javax.validation.constraints.Min;

public class QuestionSelection {
	
	private String label;
	@Min(1)
	private int score;
	@Min(1)
	private int seqId;
	
	public String getLabel() {
		return label;
	}
	public int getScore() {
		return score;
	}
	public int getSeqId() {
		return seqId;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}
	
}
