package br.com.phamtecnologia.dtos.responses;

public record ForgotPasswordResponse(
        String email,
        String message

) {
}
