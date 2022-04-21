package ru.lernup.ugadayka.springboottest;

import Event.EventPub;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.Scanner;
@Slf4j
@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);

//			ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
			Locale locale = Locale.getDefault();
			Scanner scanner = new Scanner(System.in);
			int factor = 1000;
			Integer number = (int)(Math.random()*factor);
			System.out.println(locale.getCountry());
			System.out.println(number);

			EventPub pub = context.getBean(EventPub.class);
			pub.publisherEvent(context.getMessage("hello", null, locale));
//			pub.pubEvent(context.getMessage("condition", null, Locale.getDefault()));
		int inputNumber = scanner.nextInt();
			while (true){


				if(inputNumber == number){
					pub.publisherEvent(context.getMessage("guessed", new Object[]{number}, locale));

					break;
				} else if(inputNumber>number){
					pub.publisherEvent(context.getMessage("less", null, locale));

				}else {
					pub.publisherEvent(context.getMessage("big", null, locale));

				}

			}
			scanner.close();
		}

//		@Override
//		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//			this.context = applicationContext;
//		}
	}

