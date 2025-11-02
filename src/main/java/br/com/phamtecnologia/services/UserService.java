package br.com.phamtecnologia.services;

import br.com.phamtecnologia.dtos.requests.AuthenticateUserRequest;
import br.com.phamtecnologia.dtos.requests.CreateUserRequest;
import br.com.phamtecnologia.dtos.responses.AuthenticateUserResponse;
import br.com.phamtecnologia.dtos.responses.CreateUserResponse;
import br.com.phamtecnologia.entities.User;
import br.com.phamtecnologia.repositories.ProfileRepository;
import br.com.phamtecnologia.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    public CreateUserResponse createUser(CreateUserRequest request) {

        var user = new User();

        user.setName(request.name());
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setDateTimeCreation(LocalDateTime.now());
        user.setProfile(profileRepository.findByName("Operator"));

        userRepository.save(user);

        return new CreateUserResponse(
          user.getId(),
          user.getName(),
          user.getEmail(),
          user.getProfile().getName(),
          user.getDateTimeCreation()
        );
    }

    public AuthenticateUserResponse authenticateUser(AuthenticateUserRequest request) {
        //TODO
        return  null;
    }
}
