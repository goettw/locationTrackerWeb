package locationTrackerWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyRestController {
	

	@Autowired
	LocationMessageReceiveService locationMessageReceiveService;
	
	@RequestMapping(value="/location", method=RequestMethod.GET )
	public Location location () {	
		return locationMessageReceiveService.getLocation();
		
		}
}
