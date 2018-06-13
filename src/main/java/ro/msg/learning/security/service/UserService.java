package ro.msg.learning.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import ro.msg.learning.security.model.User;

import java.util.List;

@Service("userService")
public interface UserService {

    User save(User user);

    User findUserById(Integer id);

    List<User> findUsers();
}
