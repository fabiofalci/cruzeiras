package controllers;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Pictures {
	
	final Logger logger = LoggerFactory.getLogger(Pictures.class);

	@RequestMapping("/publish/picture")
	public String publish() {
		return "/publishing/picture";
	}
	
	@RequestMapping("/pictureupload")
	public String upload(@RequestParam("datafile") MultipartFile multipartFile) {
		try {
			logger.info("Upload {} bytes", multipartFile.getBytes().length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "/publishing/picture";
	}
	
}
