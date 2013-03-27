package org.touchmars.survey.model.mongo;

import java.util.Date;

public class ActivePeriod {

	private Date activePeriodStart;
	private Date activePeriodEnd;
	
	public Date getActivePeriodStart() {
		return activePeriodStart;
	}
	public Date getActivePeriodEnd() {
		return activePeriodEnd;
	}
	public void setActivePeriodStart(Date activePeriodStart) {
		this.activePeriodStart = activePeriodStart;
	}
	public void setActivePeriodEnd(Date activePeriodEnd) {
		this.activePeriodEnd = activePeriodEnd;
	}
}
