package github.jessycadev.arquiteturaspring.montadora.configuration;

import github.jessycadev.arquiteturaspring.montadora.Motor;
import github.jessycadev.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name="motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalo(120);
        motor.setCilidros(4);
        motor.setModelo("XPTO-O");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;

    }

    @Primary //escolhe qual o beans que vai ser injetado
    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalo(110);
        motor.setCilidros(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;

    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalo(180);
        motor.setCilidros(4);
        motor.setModelo("XPTO-O");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;

    }

}
