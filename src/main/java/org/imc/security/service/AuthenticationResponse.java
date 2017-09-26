package org.imc.security.service;

import java.io.Serializable;

/**
 * Created by rahul on 26.09.17.
 */
public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
