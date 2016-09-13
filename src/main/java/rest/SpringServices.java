package rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class SpringServices {
	
    @RequestMapping(value = "/ping")
    public void Ping() {
    	System.out.println("ping services");
    }

    @RequestMapping(value = "/{name}")
    public TextDTO returnText(@PathVariable String name) {
    	System.out.println("services: " + name);
    	TextDTO t = new TextDTO(name);
    	return t;
    }
}
