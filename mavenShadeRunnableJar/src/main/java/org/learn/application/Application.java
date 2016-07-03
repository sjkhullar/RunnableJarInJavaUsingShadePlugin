package org.learn.application;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("Starting execution of main method!");
		logger.info("Printing sports list:");
		List<String> listOfSports = Arrays.asList("Soccer", "Badminton", "Tennis", "Rugby", "BaseBall");
		listOfSports.stream().forEach((sport) -> {
			logger.info(sport);

		});
		logger.info("Completed the execution of main method");
	}
}
