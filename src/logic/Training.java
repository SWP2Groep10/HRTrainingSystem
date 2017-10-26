package logic;

//import java.sql.Date;
import java.util.Arrays;

public class Training {
	public enum StatusType{EXPIRED, ONGOING, PLANNED};
	
	private User[] attendinglist;
	private Location location;
	private int trainingID, locationID;
	private Survey survey;
	private int duration; //in minutes
	private StatusType status;
	
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
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType input) {
		this.status = input;
	}
	public User[] getAttendinglist() {
		return attendinglist;
	}
	public void setAttendinglist(User[] attendinglist) {
		this.attendinglist = attendinglist;
	}
	
	@Override
	public String toString() {
		return "Training [attendinglist=" + Arrays.toString(attendinglist) + ", location=" + location + ", trainingID="
				+ trainingID + ", locationID=" + locationID + ", survey=" + survey + ", duration=" + duration
				+ ", status=" + status + "]";
	}
	
	public Training(User[] attendinglist, Location location, int trainingID, int locationID, Survey survey,
			int duration, StatusType statusType) {
		super();
		this.attendinglist = attendinglist;
		this.location = location;
		this.trainingID = trainingID;
		this.locationID = locationID;
		this.survey = survey;
		this.duration = duration;
		this.status = statusType;
	}
	
	
	
	
	
	
}
