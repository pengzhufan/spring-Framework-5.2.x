package com.shadow.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
public class C {
	public C(){
		log.debug("create c");
	}
}
