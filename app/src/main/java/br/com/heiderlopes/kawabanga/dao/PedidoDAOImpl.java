package br.com.heiderlopes.kawabanga.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.heiderlopes.kawabanga.model.Pedido;

/**
 * Created by heider on 28/06/16.
 */
public class PedidoDAOImpl implements PedidoDAO{

    private static List<Pedido> pedidos = new ArrayList<>();

    @Override
    public boolean gravar(Pedido pedido) {
        pedidos.add(pedido);
        return true;
    }

    @Override
    public List<Pedido> getTodosPedidos() {
        return pedidos;
    }
}
