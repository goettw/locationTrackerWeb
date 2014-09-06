package locationTrackerWeb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	double latitude;
	double longitude;
	
	@JsonCreator
	public Location(@JsonProperty("latitude") double latitude, @JsonProperty("longitude") double longuitude) {
		this.latitude = latitude;
		this.longitude = longuitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	@Override
	public String toString() {
		return ("longitude: " + Double.toString(longitude) + " - " + "latitude: " + Double.toString(latitude));
	}
	
	
}
