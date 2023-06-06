import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    public void  testar_email_com_arroba(){
        Pessoa email = new Pessoa();
        assertTrue(email.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void  testar_email_sem_arroba(){
        Pessoa email = new Pessoa();
        assertFalse(email.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void  testar_email_mais_50_caracteres(){
        Pessoa email = new Pessoa();
        assertEquals(Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"),false);
    }
}
