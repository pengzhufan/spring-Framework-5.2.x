package com.shadow.beans.selector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

@Slf4j(topic = "e")
public class X {
	public X(){
		log.debug("create x");
	}
}
