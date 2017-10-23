package logic;

import java.sql.Date;

public class Training {
	private Location location;
	private int trainingID, locationID;
	private String survey;
	private int duration; //in minutes
	private boolean status;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Training [location=" + location + ", trainingID=" + trainingID + ", locationID=" + locationID
				+ ", survey=" + survey + ", duration=" + duration + ", status=" + status + "]";
	}

	
	
	
}
