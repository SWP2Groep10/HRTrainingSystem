package logic;

import java.sql.Date;

public class Training {
	private int trainingID, locationID;
	private String survey;
	private Date periodOfTime;
	private boolean status;
	
	public Training(int trainingID, int locationID, String survey, Date periodOfTime, boolean status) {
		super();
		this.trainingID = trainingID;
		this.locationID = locationID;
		this.survey = survey;
		this.periodOfTime = periodOfTime;
		this.status = status;
	}

	public int getTrainingID() {
		return trainingID;
	}
	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	public String getSurvey() {
		return survey;
	}
	public void setSurvey(String survey) {
		this.survey = survey;
	}
	public Date getPeriodOfTime() {
		return periodOfTime;
	}
	public void setPeriodOfTime(Date periodOfTime) {
		this.periodOfTime = periodOfTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TrainingID= " + trainingID + ", LocationID= " + locationID + ", Survey= " + survey
				+ ", PeriodOfTime= " + periodOfTime + ", Status= " + status;
	}
	
	
}
