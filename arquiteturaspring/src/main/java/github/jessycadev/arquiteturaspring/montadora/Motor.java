package github.jessycadev.arquiteturaspring.montadora;

public class Motor {
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalo() {
        return cavalo;
    }

    public void setCavalo(Integer cavalo) {
        this.cavalo = cavalo;
    }

    public Integer getCilidros() {
        return cilidros;
    }

    public void setCilidros(Integer cilidros) {
        this.cilidros = cilidros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    private String modelo;
    private Integer cavalo;
    private Integer cilidros;
    private Double litragem;
    private TipoMotor tipo;

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalo=" + cavalo +
                ", cilidros=" + cilidros +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}
