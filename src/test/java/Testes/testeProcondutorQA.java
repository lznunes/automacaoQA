package Testes;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.*;

import base.BaseTeste;

public class testeProcondutorQA  extends BaseTeste
{
	
	
	@Test
	public void TestaDDI_Italia() throws InterruptedException 
	{
		
		carregaPessoa();
		CriaContaGoogle(pessoa.nome(),pessoa.sobrenome(),"+39" + pessoa.telefone());
		assertTrue(contaGoogle.erroTelefone());
		
		
	}
	@Test
	public void TestaDDI_Bulgaria() throws InterruptedException 
	{
		
		carregaPessoa();
		CriaContaGoogle(pessoa.nome(),pessoa.sobrenome(),"+359" + pessoa.telefone());
		assertTrue(contaGoogle.erroTelefone());
		
		
	}
	
	@Test
	public void TestaDDI_Israel() throws InterruptedException 
	{
		
		carregaPessoa();
		CriaContaGoogle(pessoa.nome(),pessoa.sobrenome(),"+972" + pessoa.telefone());
		assertTrue(contaGoogle.erroTelefone());
		
		
	}
	
	
	

	
	
	
}

