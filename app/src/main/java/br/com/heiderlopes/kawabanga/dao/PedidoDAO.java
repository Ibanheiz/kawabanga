package br.com.heiderlopes.kawabanga.dao;

import java.util.List;

import br.com.heiderlopes.kawabanga.model.Pedido;

/**
 * Created by heider on 28/06/16.
 */
public interface PedidoDAO {

    boolean gravar(Pedido pedido);
    List<Pedido> getTodosPedidos();
}
