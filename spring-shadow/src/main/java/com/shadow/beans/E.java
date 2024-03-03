package com.shadow.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@Import(F.class)
public class E {
	public E(){
		log.debug("create e");
	}

	@Bean
	public O o(){
		return new O();
	}
}
