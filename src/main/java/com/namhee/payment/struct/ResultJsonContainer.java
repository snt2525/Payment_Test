package com.namhee.payment.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.namhee.payment.lang.HttpStatusCode;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.MessageSource;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(value = {"error"})
public class ResultJsonContainer {
		
	private MessageSource messageSource;
	
	private HttpStatusCode status;
	private Object result;
	
	private String	resultCode;
	private String	systemMsg;
	private String	reason;
	private LocalDateTime responseTime;
	
	public ResultJsonContainer(HttpStatusCode code, String resultCode, String systemMsg, String reason, LocalDateTime currentTime) {
		this.status			= code;
		this.resultCode		= resultCode;
		this.systemMsg		= systemMsg;
		this.reason			= reason;
		this.responseTime 	= currentTime;
	}
	
	public ResultJsonContainer(HttpStatusCode code, String resultCode, String systemMsg) {
		this( code, resultCode, systemMsg, "" , LocalDateTime.now());
	}

	public ResultJsonContainer(Object result) {
		this( HttpStatusCode.OK, "0000", "ok good", "", LocalDateTime.now());
		this.result = result;
	}
}
