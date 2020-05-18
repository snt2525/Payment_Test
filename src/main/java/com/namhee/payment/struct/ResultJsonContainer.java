package com.namhee.payment.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.namhee.payment.lang.HttpStatusCode;
import lombok.Data;
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
	private String	userMsg;
	private String	reason;
	private LocalDateTime responseTime;
	
	public ResultJsonContainer(HttpStatusCode code, String resultCode, String systemMsg, String userMsg, String reason, LocalDateTime currentTime) {
		this.status			= code;
		this.resultCode		= resultCode;
		this.systemMsg		= systemMsg;
		this.userMsg		= userMsg;
		this.reason			= reason;
		this.responseTime 	= currentTime;
	}
	
	public ResultJsonContainer(HttpStatusCode code, String resultCode, String systemMsg, String userMsg) {
		
		this( code, resultCode, systemMsg, userMsg, "" , LocalDateTime.now());
	}

	public ResultJsonContainer(Object result) {
		
		this( HttpStatusCode.OK, "0000", "ok good", "OK", "", LocalDateTime.now());
		this.result = result;
	}
	
	public Object getResult() {
		return result;
	}
	
	public String getStatus() {
		return status.code;
	}
	
	public String getUserMsg() {
		return userMsg;
	}
	
	public String getSysTemMsg() {
		return systemMsg;
	}
	
	public String getResultCode() {
		return resultCode;
	}
	
	public String getReason() {
		return reason;
	}

	public LocalDateTime getResponseTime() {
		return responseTime;
	}
}