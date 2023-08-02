package com.app.vdc.demo;

import com.app.vdc.demo.Model.*;
import com.app.vdc.demo.services.ProdutoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void CadastrarProduto(){
		ProdutoService pro = new ProdutoService();
		boolean result = pro.CadastrarProduto(new Produto(),new User());
	    assertEquals(result,false);
	}
}
