package com.shadow.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
public class D extends V implements I{

	public D(){
		log.debug("create d");
	}
}
