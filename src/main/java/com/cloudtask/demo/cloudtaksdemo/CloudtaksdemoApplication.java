package com.cloudtask.demo.cloudtaksdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
@EnableTask
@EnableConfigurationProperties({SimpleTaskProperties.class})
public class CloudtaksdemoApplication {

	@Bean
	public CommandLineRunner commandLineRunner() {
		return new SparkAppClientRunner();
	}

	private class SparkAppClientRunner implements CommandLineRunner {

		private final Log logger = LogFactory.getLog(SparkAppClientRunner.class);

		@Autowired
		private SimpleTaskProperties config;


		@Override
		public void run(String... args) throws Exception {
			ArrayList<String> argList = new ArrayList<>();
			if (StringUtils.hasText(config.getName())) {
				argList.add("--name");
				argList.add(config.getName());
			}
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudtaksdemoApplication.class, args);


	}
}
