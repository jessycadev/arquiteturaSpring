package github.jessycadev.arquiteturaspring;

import github.jessycadev.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ExemploInjecaoDepedencia {
    public static void main(String[] args) throws SQLException {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("url");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository todoRepository = null;//new SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator todoValidator = new TodoValidator(todoRepository);
        MailSender sender = new MailSender(todoRepository);

        TodoService todoService = new TodoService(todoRepository, todoValidator, sender);
    }
}
