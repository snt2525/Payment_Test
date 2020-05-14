package com.namhee.payment.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.context.MessageSource;

import java.util.Date;

/**
 * 실행 결과를 결과 코드를 포함한 JSON으로 감싸기 위한 컨테이너
 * @author nahoya
 *
 */
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
	private Date	responseTime;
	
	public ResultJsonContainer(HttpStatusCode code, String resultCode, String systemMsg, String userMsg, String reason) {
		this.status			= code;
		this.resultCode		= resultCode;
		this.systemMsg		= systemMsg;
		this.userMsg		= userMsg;
		this.reason			= reason;
		this.responseTime 	= new Date();
	}
	
	public ResultJsonContainer(HttpStatusCode code, String resultCode, String systemMsg, String userMsg) {
		
		this( code, resultCode, systemMsg, userMsg, "" );
	}

	public ResultJsonContainer(Object result) {
		
		this( HttpStatusCode.OK, "0000", "ok good", "OK", "");
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
}
