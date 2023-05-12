import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioPlenoTest {

    @Test
    void deveRetonarAprovado() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setNota1(6.0f);
        funcionario.setNota2(6.0f);
        assertEquals("Aprovado", funcionario.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setNota1(6.0f);
        funcionario.setNota2(5.9f);
        assertEquals("Reprovado", funcionario.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setNota1(6.0f);
        funcionario.setNota2(5.9f);
        funcionario.setNome("Ricardo");
        funcionario.setcpf(2);
        assertEquals("Funcionário{cpf=2, nome='Ricardo', resultado=Reprovado}", funcionario.getInfo());
    }
}