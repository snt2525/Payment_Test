package com.namhee.payment.utils;

public enum HttpStatusCode {

	OK("200"),
	Created("201"),
	No_Content("204"),
	Moved_Permanently("301"),
	Not_Modified("304"),
	Bad_Request("400"),
	Unauthorized("401"),
	Forbidden("403"),
	Not_Found("404"),
	Method_Not_Allowed("405"),
	Not_Acceptable("406"),
	Conflict("409"),
	Precondition_Failed("412"),
	Unsupported_Media_Type("415"),
	Internal_Server_Error("500")
	;
	
	
	public String code;

	HttpStatusCode(String code) {
		this.code = code;
	}
	
}
