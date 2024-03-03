package com.shadow.beans.importBeanDefinitionRegistrar;

import com.shadow.beans.P;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
public class D {

	public D(){
		log.debug("create d");
	}

}
