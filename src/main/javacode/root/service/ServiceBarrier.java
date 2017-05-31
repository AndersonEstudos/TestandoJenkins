package root.service;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBarrier {
	
	@RequestMapping(
			value = "/clearBarriers",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String clearBarrier(){
		return getClass().getSimpleName();
	}
	@RequestMapping(
			value = "/getBarriers",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String getBarrier(){
		return getClass().getSimpleName();
	}
}
