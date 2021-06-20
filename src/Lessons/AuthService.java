package Lessons;

import java.sql.SQLException;
import java.util.Optional;

public interface AuthService {

    void start();


    void stop();


    Optional<String> getNickByLoginAndPass(String login, String pass);

    String isLoginExist(String login) throws SQLException;

    String isNicknameExist(String nickname) throws SQLException;

    boolean registerNewUser(String login, String password, String nickname);

    boolean changeNickname(String oldNickname, String newNickname);




}
