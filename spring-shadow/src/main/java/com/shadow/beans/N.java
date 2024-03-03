package com.shadow.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Slf4j(topic = "e")
public class N {
	public N(){
		log.debug("create n");
	}

	@Bean
	public P p(){
		return new P();
	}
}
