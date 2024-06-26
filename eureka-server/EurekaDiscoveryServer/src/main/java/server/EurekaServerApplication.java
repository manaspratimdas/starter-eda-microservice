package server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	
	private static final Logger logger = LogManager.getLogger(EurekaServerApplication.class);
	public static void main(String[] args) {
		
		logger.info("Starting EUREKA-DISCOVERY-SERVER");
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
