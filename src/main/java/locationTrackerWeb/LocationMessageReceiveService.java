package locationTrackerWeb;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

@Service
public class LocationMessageReceiveService {

	private static Logger logger = Logger
			.getLogger(LocationMessageReceiveService.class);

	public void receive(Location l) {
		logger.info(l.toString());

	}
}
