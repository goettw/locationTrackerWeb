package locationTrackerWeb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	double latitude;
	double longuitude;
	
	@JsonCreator
	public Location(@JsonProperty("latitude") double latitude, @JsonProperty("longitude") double longuitude) {
		this.latitude = latitude;
		this.longuitude = longuitude;
	}

	@Override
	public String toString() {
		return ("longitude: " + Double.toString(longuitude) + " - " + "latitude: " + Double.toString(latitude));
	}
	
	
}
