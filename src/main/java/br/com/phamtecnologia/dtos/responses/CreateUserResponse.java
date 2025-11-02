package br.com.phamtecnologia.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserResponse(
    UUID id,
    String name,
    String email,
    String profile,
    LocalDateTime dateTimeCreation
) {
}
