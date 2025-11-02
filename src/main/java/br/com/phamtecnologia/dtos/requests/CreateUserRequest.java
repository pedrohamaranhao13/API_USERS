package br.com.phamtecnologia.dtos.requests;

public record CreateUserRequest(
        String name,
        String email,
        String password
) {
}
