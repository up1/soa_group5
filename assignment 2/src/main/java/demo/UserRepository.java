package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public User findById(Long id) {
        try {
            return this.jdbcTemplate.queryForObject("SELECT * FROM USERS WHERE id=?", new Object[]{id}, new UserRowMapper());
        }catch (Exception exception) {
            throw new UserNotFoundException(id);
        }
    }

    @Transactional(readOnly = true)
    public List<User> findAll(Long page, Long userperpage) {
        if (page < 1) {
            throw new BadParameterException("page", page);
        } else if (userperpage < 0) {
            throw new BadParameterException("userperpage", userperpage);
        }

        int start = (int)((page - 1) * userperpage);
        List<User> userList = this.jdbcTemplate.query("SELECT id, firstname, lastname FROM USERS LIMIT ?, ?", new Object[]{start, userperpage}, new UserRowMapper());

        return userList;
    }

    @Transactional
    public void save(User user) {
        String sql = "INSERT INTO USERS(id, firstname, lastname) VALUES (?,?,?)";
        this.jdbcTemplate.update(sql, user.getId(), user.getFirstname(), user.getLastname());
    }

    public void delete(Long id) {
        String sql = "DELETE FROM USERS WHERE id=?";
        this.jdbcTemplate.update(sql, id);
    }
}
