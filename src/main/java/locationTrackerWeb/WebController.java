package locationTrackerWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class WebController {

	@Autowired
	LocationMessageReceiveService locationMessageReceiveService;

	@RequestMapping(value="/home", method=RequestMethod.GET )
	public ModelAndView home () {	
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("location", locationMessageReceiveService.getLocation());
		return modelAndView;
		}
}
