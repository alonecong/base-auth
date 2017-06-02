package dev.local.secruity;

import lombok.Getter;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable {
    private static final long serialVersionUID = 1250166508152483573L;
    @Getter
    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

}
