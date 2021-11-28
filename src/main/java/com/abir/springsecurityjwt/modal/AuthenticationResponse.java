package com.abir.springsecurityjwt.modal;

public class AuthenticationResponse {

	private final String jwtoken;

	public AuthenticationResponse(String jwtoken) {
		super();
		this.jwtoken = jwtoken;
	}

	public String getJwtoken() {
		return jwtoken;
	}

}
