package net.thrymr.anglar4services.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CoinResponse {
	
	public Boolean isSuccess;
	public String message;
	public Object payLoad;
	public String URL;

	public CoinResponse(Boolean isSuccess, String message, String URL) {
		this.isSuccess = isSuccess;
		this.message = message;
		this.URL = URL;
	}

	public CoinResponse(Boolean isSuccess, String message, Object payLoad) {
		this.isSuccess = isSuccess;
		this.message = message;
		this.payLoad = payLoad;
	}
	
	public CoinResponse(Boolean isSuccess, Object payLoad) {
		this.isSuccess = isSuccess;
		this.payLoad = payLoad;
	}

	public CoinResponse(Boolean isSuccess, String message) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
	}

	public CoinResponse(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public CoinResponse() {
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(Object payLoad) {
		this.payLoad = payLoad;
	}

}
