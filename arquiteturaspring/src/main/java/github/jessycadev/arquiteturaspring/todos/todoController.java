package github.jessycadev.arquiteturaspring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {
    private TodoService service;

    public TodoController(TodoService todoService){
        this.service = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todoE){
        try {
            return this.service.salvar(todoE);
        }catch (IllegalArgumentException e) {
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }
    }

    @PutMapping("{id}")
    public void AtualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId((id));
        this.service.atualizarStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity buscarTodo(@PathVariable("id") Integer id){
        return this.service.buscarTodoPorId(id);

    }
}
