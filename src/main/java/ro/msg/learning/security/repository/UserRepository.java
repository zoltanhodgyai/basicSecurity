package ro.msg.learning.security.repository;

import org.springframework.data.repository.Repository;
import ro.msg.learning.security.model.User;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    User save(User user);

    User findUserById(Integer id);

    List<User> findAll();

    User findUserByUsername(String username);
}
