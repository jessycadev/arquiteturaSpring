package github.jessycadev.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public TodoEntity atualizarStatus(TodoEntity todo) {
        return repository.save((todo));
    }

    public TodoEntity buscarTodoPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
