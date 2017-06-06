package com.cloudtask.demo.cloudtaksdemo;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * {@link CommandLineRunner} implementation that will run a Spark App in client mode using
 * configuration properties provided.
 *
 * @author Thomas Risberg
 */
@EnableTask
@Configuration
@EnableConfigurationProperties(SimpleTaskProperties.class)
public class SparkClientTaskConfiguration {


}
