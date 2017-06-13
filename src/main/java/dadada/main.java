package dadada;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by yu3 on 2017/6/13.
 */
public class main {

    public static void main (String[] args) {
        String password = "user";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.print(passwordEncoder.encode(password));
    }
}
