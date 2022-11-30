package ru.edu.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

@Configuration
@EnableWs
public class WsConfig extends WsConfigurerAdapter {

	// создадим сервлет для эндпоинта /ws
	@Bean
	public ServletRegistrationBean wsBean(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);

		// создали сервлет и указали, какие эндпоинты он будет обслуживать
		return new ServletRegistrationBean(servlet, "/ws");
	}

}
