package br.com.phamtecnologia.dtos.requests;

public record AuthenticateUserRequest(
        String email,
        String password
) {
}
