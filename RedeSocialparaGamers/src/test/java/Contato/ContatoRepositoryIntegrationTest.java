package Contato;

import java.util.List;
import javax.validation.ConstraintViolationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.redeGamer.RedeSocialparaGamers.model.ContatoModel;

import org.springframework.data.jpa.repository.JpaRepository;


//@RunWith rodará com o spring runner, 
//que suporta testes de integração de interfaces (testa se a repository está funcionando) 

@RunWith (SpringRunner.class)
@DataJpaTest //melhor testador de JPA
public class ContatoRepositoryIntegrationTest { 
	
	private com.redeGamer.RedeSocialparaGamers.model.ContatoModel contato;
	
	@Autowired 
	private com.redeGamer.RedeSocialparaGamers.repository.ContatoRepository contatoRepository;
	
	@Before
	public void start() { 
		contato = new ContatoModel("Gabriel", "011y", "9xxxxxxx9");
		} 
	
	//regra, não aceita exceções, é a maneira de especificar 
	//que a execução de um teste lançará uma exceção 
	//Verifica se o @NotEmpty está funcionando
	
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	
	@Test public void salvarComTelNulo() throws Exception { 
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O Telefone deve ser preenchido"); 
		
		contato.setTelefone(null);
		contatoRepository.save(contato);
		}
	
	@Test
	public void salvarComDddNulo() throws Exception { 
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O DDD deve ser preenchido");
		
		contato.setDdd(null);
		contatoRepository.save(contato);
		}
	
	@Test
	public void salvarComNomeNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O Nome deve ser preenchido");
		
		contato.setNome(null);
		contatoRepository.save(contato); 
		}
	}
