package root.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class ServiceSpot {
	
	@RequestMapping(
			value = "/updatedbSpots",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String updatedbSpot(){
		return getClass().getSimpleName();
	}
	
	@RequestMapping(
			value = "/clearSpots",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String clearSpot(){
		return getClass().getSimpleName();
	}
	
	@RequestMapping(
			value = "/getSpots",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String getSpot(){
		return getClass().getSimpleName();
	}
	@RequestMapping(
			value = "/createSpots",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String CreateSpot(@RequestBody String request){
		JsonObject json = new Gson().fromJson(request, JsonObject.class);
		System.out.println(json.get("type").toString());
		return "";
	}
}
