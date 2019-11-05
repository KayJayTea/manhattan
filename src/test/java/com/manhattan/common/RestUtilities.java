package com.manhattan.common;

import static org.hamcrest.Matchers.equalTo;

import com.manhattan.constants.ExpectBody;
import com.manhattan.constants.ExpectHeader;
import com.manhattan.constants.Paths;
import com.manhattan.constants.StatusCodes;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestUtilities {
	public static String ENDPOINT;
	public static RequestSpecBuilder REQUEST_BUILDER;
	public static RequestSpecification REQUEST_SPEC;
	public static ResponseSpecBuilder RESPONSE_BUILDER;
	public static ResponseSpecification RESPONSE_SPEC;
	
	public static void setEndpoint(String endpoint) {
		ENDPOINT = endpoint;
	}
	
	public static RequestSpecification getRequestSpecification_MAIN() {
		REQUEST_BUILDER = new RequestSpecBuilder();
		REQUEST_BUILDER.setBaseUri(Paths.BASE_URI_MAIN);
		
		REQUEST_SPEC = REQUEST_BUILDER.build();
		
		return REQUEST_SPEC;
	}
	
	public static RequestSpecification getRequestSpecification_BACKUP() {
		REQUEST_BUILDER = new RequestSpecBuilder();
		REQUEST_BUILDER.setBaseUri(Paths.BASE_URI_BACKUP);
		
		REQUEST_SPEC = REQUEST_BUILDER.build();
		
		return REQUEST_SPEC;
	}
	
	public static ResponseSpecification getResponseSpecification() {
		RESPONSE_BUILDER = new ResponseSpecBuilder();
		
		RESPONSE_BUILDER.expectStatusCode(StatusCodes.SUCCESS_STATUS_CODE);
		
		RESPONSE_BUILDER.expectHeader("Server", ExpectHeader.HEADER_SERVER);
		RESPONSE_BUILDER.expectHeader("Content-Type", ExpectHeader.HEADER_CONTENT_TYPE);
		RESPONSE_BUILDER.expectHeader("Transfer-Encoding", ExpectHeader.HEADER_TRANSFER_ENCODING);
		
		RESPONSE_BUILDER.expectBody("response.isError", equalTo(ExpectBody.BODY_IS_ERROR));
		RESPONSE_BUILDER.expectBody("response.respMsg", equalTo(ExpectBody.BODY_RESPONSE_MESSAGE));
		RESPONSE_BUILDER.expectBody("response.respCode", equalTo(ExpectBody.BODY_RESPONSE_CODE));
		
		RESPONSE_SPEC = RESPONSE_BUILDER.build();
		
		return RESPONSE_SPEC;
	}
}
