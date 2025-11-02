package br.com.phamtecnologia.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record AuthenticateUserResponse(
    UUID id,
    String name,
    String email,
    String profile,
    LocalDateTime dateTimeAccessAec
) {
}
