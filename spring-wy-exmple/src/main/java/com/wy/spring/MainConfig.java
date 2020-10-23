package com.wy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by wangyi
 * @classname MainConfig
 * @description TODO
 * @date 2020/10/21 20:51
 */
@Configuration
public class MainConfig {

	@Bean
	public Car getCar() {
		return  new Car();
	}
}
