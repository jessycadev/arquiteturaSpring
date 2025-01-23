package github.jessycadev.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    private TodoRepository todoRepository;

    public MailSender(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void enviar(String mensagem){
        System.out.println("Eviado emaiol:" +  mensagem);
    }
}
