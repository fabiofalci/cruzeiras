package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Pictures {
	
	final Logger logger = LoggerFactory.getLogger(Pictures.class);

	@RequestMapping("/publish/picture")
	public String publish() {
		return "/publishing/picture";
	}
	
	@RequestMapping("/pictureupload")
	public String upload(@RequestParam("datafile") byte[] datafile) {
		logger.info("Upload {} bytes", datafile != null ? datafile.length : 0);
		return "/publishing/picture";
	}
	
}
