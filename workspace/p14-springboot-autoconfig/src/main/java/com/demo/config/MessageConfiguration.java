package com.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.api.EnglishConverter;
import com.demo.api.MessageConverter;

@Configuration
@ConditionalOnClass(MessageConverter.class)
public class MessageConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public MessageConverter getMessageConverter() {
		return new EnglishConverter();
	}
}
