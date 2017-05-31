package root.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDriver {
	
	@RequestMapping(
			value = "/clearDrivers",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String clearDriver(){
		return getClass().getSimpleName();
	}
	
	@RequestMapping(
			value = "/getDrivers",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String getDriver(){
		return getClass().getSimpleName();
	}
}
