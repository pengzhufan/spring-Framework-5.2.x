package org.spring.aop.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.spring.beanPostProcessor.bean.BeanPostProcessorService;
import org.spring.beanPostProcessor.bpp.TestBeanPostProcessorNormal;
import org.spring.beanPostProcessor.bpp.TestBeanPostProcessorOrderedUpdatePorperties;
import org.spring.beanPostProcessor.bpp.TestBeanPostProcessorPriorityOrderedUpdatePorperties;
import org.spring.beanPostProcessor.config.App;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Slf4j(topic = "e")
public class TestRegisterBeanPostProcessor {

	@Test
	public void testBeanFactoryPostProcessor(){
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext();
		context.register(App.class);
		context.refresh();
	}

	@Test
	public void testBeanPostProcessor(){
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext();
		context.register(App.class);
		context.refresh();
		BeanPostProcessorService bean = context.getBean(BeanPostProcessorService.class);
		String str = bean.getStr();
		Integer i = bean.getI();
		log.debug("str[{}],I[{}]",str,i);
	}

	@Test
	public void testBeanPostProcessorNormalAutowired(){
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext();
		context.register(App.class);
		context.refresh();
//		TestBeanPostProcessorNormal bean = context.getBean(TestBeanPostProcessorNormal.class);
//		bean.printfInfo();
//
//
//		TestBeanPostProcessorOrderedUpdatePorperties Ordered = context.getBean(TestBeanPostProcessorOrderedUpdatePorperties.class);
//		Ordered.printfInfo();



		TestBeanPostProcessorPriorityOrderedUpdatePorperties PriorityOrdered = context.getBean(TestBeanPostProcessorPriorityOrderedUpdatePorperties.class);
		PriorityOrdered.printfInfo();
	}


	@Test
	public void testBeanPostProcessorAop(){
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext();
		context.register(App.class);
		context.refresh();

		BeanPostProcessorService bean = context.getBean(BeanPostProcessorService.class);
		bean.testAop();

//		TestBeanPostProcessorOrderedUpdatePorperties Ordered = context.getBean(TestBeanPostProcessorOrderedUpdatePorperties.class);
//		Ordered.printfInfo();

		TestBeanPostProcessorPriorityOrderedUpdatePorperties PriorityOrdered = context.getBean(TestBeanPostProcessorPriorityOrderedUpdatePorperties.class);
		PriorityOrdered.printfInfo();
	}


	@Test
	public void testBeanPostProcessorCheck(){
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext();
		context.register(App.class);
		context.refresh();

		BeanPostProcessorService bean = context.getBean(BeanPostProcessorService.class);
		bean.testAop();

		String str = bean.getStr();
		Integer i = bean.getI();
		log.debug("str[{}],I[{}]",str,i);

//		TestBeanPostProcessorOrderedUpdatePorperties Ordered = context.getBean(TestBeanPostProcessorOrderedUpdatePorperties.class);
//		Ordered.printfInfo();
//
//		TestBeanPostProcessorPriorityOrderedUpdatePorperties PriorityOrdered = context.getBean(TestBeanPostProcessorPriorityOrderedUpdatePorperties.class);
//		PriorityOrdered.printfInfo();
	}
}
