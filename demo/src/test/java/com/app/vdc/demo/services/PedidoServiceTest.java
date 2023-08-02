package com.app.vdc.demo.services;

import com.app.vdc.demo.Model.Carrinho;
import com.app.vdc.demo.Model.Pedido;
import com.app.vdc.demo.repository.CarrinhoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class PedidoServiceTest {
    @InjectMocks
    private PedidoService pedidoService;
    @Mock
    private Pedido pedido;
    @Mock
    private CarrinhoRepository carrinho;
    @Mock
    private Carrinho carrinhocar;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void finalizarPedido() {

    }
}