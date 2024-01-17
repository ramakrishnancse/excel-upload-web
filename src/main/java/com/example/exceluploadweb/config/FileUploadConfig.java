package com.example.exceluploadweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import lombok.Getter;

@Configuration
@Getter
public class FileUploadConfig {
	
	
	
	@Value("${excel.allowed-types}")
	private String allowedTypes[];
	
	@Value("${excel.sheet-name}")
	private String sheetNameToRead;
	
	@Value("${excel.headers}")
	private String headers[];
	
	@Value("${excel.content-type}")
	private String contentType[];
	
	@PostConstruct
	public void logFileUploadConfig() {
		System.out.println("welcome to file upload config "+this.contentType+", "+this.sheetNameToRead+", "+this.allowedTypes+", "+this.headers);
	}

}
