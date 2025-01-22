package github.jessycadev.arquiteturaspring.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera o valor no banco, autoincrmento do banco de dados
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "concluido")
    private Boolean concluido;    //existe diferença entre Boolean (recebe o valor null) e boolean (primitivo) so recebe true ou false

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }


}
