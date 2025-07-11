package Servicies;

import Auth.AuthResponse;
import Auth.LoginRequest;
import Auth.RegisterRequest;
import Models.Role;
import Models.UserModel;
import Repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        UserModel user = UserModel.builder()
                .userName(request.getUsername())
                .password(request.getPassword())
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .role(Role.USER)
                .build();

        userRepository.save(user);

        return AuthResponse.builder().token(jwtService.getToken(user)).build();

    }
}
