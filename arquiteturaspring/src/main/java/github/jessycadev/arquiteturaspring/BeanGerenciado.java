package github.jessycadev.arquiteturaspring;

import github.jessycadev.arquiteturaspring.todos.TodoEntity;
import github.jessycadev.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    //três forma de injeção de depedencia 1. propriedade 2.metodo construtor 3.via set
    //forma mais indicada é via construtor 

    @Autowired
    private TodoValidator validator;

    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }



}
