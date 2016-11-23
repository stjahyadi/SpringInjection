package com.seanyoung.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.seanyoung.component.MessagePrinter;
import com.seanyoung.component.MessageService;

/**
 * Hello world!
 * 
 */
@Configuration
@ComponentScan("com.seanyoung")
public class App {
	// Test 1: Ambiguous Beans
	// @Resource
	// private Party party;
	//
	// @Autowired
	// private Party party;
	//
	// @Inject
	// private Party party;

	// Test 2: Field Name
	// @Resource
	// private Party person;
	//
	// @Autowired
	// private Party person;
	//
	// @Inject
	// private Party person;

	// Test 3: Field Type
	// @Resource
	// private Person party;
	//
	// @Autowired
	// private Person party;
	//
	// @Inject
	// private Person party;

	// Test 4: Default Name Qualifier
	// @Resource
	// @Qualifier("person")
	// private Party party;
	//
	// @Autowired
	// @Qualifier("person")
	// private Party party;
	//
	// @Inject
	// @Qualifier("person")
	// private Party party;
	
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				App.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
	}
}
