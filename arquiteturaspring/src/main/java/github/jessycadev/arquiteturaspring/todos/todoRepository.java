package github.jessycadev.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepository extends JpaRepository<todoEntity, Integer> {
}
