package locationTrackerWeb;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

@Service
public class LocationMessageReceiveService {
	Location l = new Location(-25.363882,131.04492);
	private static Logger logger = Logger
			.getLogger(LocationMessageReceiveService.class);

	public void receive(Location l) {
		logger.info(l.toString());
		this.l = l;
	}
	
	Location getLocation() {
		return l;
	}
}
