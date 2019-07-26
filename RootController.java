package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private static final String template = "Root %s!";


    @RequestMapping("/")
	public String rootDir(@RequestParam(value="message", defaultValue="Directory") String message){	
			return new String(String.format(template, message));
		}
			
	
