package github.jessycadev.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class todoService {

    private todoRepository repository;

    public todoService(todoRepository todoRepository){
        this.repository = todoRepository;
    }

    public todoEntity salvar(todoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public todoEntity atualizarStatus(todoEntity todo) {
        return repository.save((todo));
    }

    public todoEntity buscarTodoPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
