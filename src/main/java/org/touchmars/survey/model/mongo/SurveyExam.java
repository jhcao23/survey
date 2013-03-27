/**
 * 
 */
package org.touchmars.survey.model.mongo;

import java.math.BigInteger;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author John Cao
 *
 */
@Document
public class SurveyExam extends AbstractDocument {
	
	private String examName;
	private String description;
	private ActivePeriod activePeriod;
	@Indexed
	private BigInteger ownerId;
	@Indexed
	private BigInteger developerId;
	
	@PersistenceConstructor
	public SurveyExam(String examName, String desc, ActivePeriod ap, BigInteger ownerId){
		this.examName = examName;
		this.description = desc;
		this.activePeriod = ap;
		this.ownerId = ownerId;
	}
		
	public String getExamName() {
		return examName;
	}
	public ActivePeriod getActivePeriod() {
		return activePeriod;
	}
	public BigInteger getOwnerId() {
		return ownerId;
	}
	public BigInteger getDeveloperId() {
		return developerId;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public void setActivePeriod(ActivePeriod activePeriod) {
		this.activePeriod = activePeriod;
	}
	public void setOwnerId(BigInteger ownerId) {
		this.ownerId = ownerId;
	}
	public void setDeveloperId(BigInteger developerId) {
		this.developerId = developerId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
