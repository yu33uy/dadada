package dadada.repository;

import dadada.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yu3 on 2017/6/13.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String name);
}
