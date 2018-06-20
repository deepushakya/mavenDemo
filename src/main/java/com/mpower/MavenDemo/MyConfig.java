package com.mpower.MavenDemo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"dao","model","services","controller"})
public class MyConfig {
	

}
