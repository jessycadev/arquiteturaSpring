package github.jessycadev.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class todoController {
    private todoService service;

    public todoController(todoService todoService){
        this.service = todoService;
    }

    @PostMapping
    public todoEntity salvar(@RequestBody todoEntity todoE){
        return this.service.salvar(todoE);
    }

    @PutMapping("{id}")
    public void AtualizarStatus(@PathVariable("id") Integer id, @RequestBody todoEntity todo){
        todo.setId((id));
        this.service.atualizarStatus(todo);
    }

    @GetMapping("{id}")
    public todoEntity buscarTodo(@PathVariable("id") Integer id){
        return this.service.buscarTodoPorId(id);

    }
}
