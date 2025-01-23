package github.jessycadev.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    //buscando apenas se existe ou nao
    boolean existsByDescricao(String descricao);

    //buscando os dados completos e verifica se existe
    TodoEntity findByDescricao(String descricao);
}
