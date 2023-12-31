package br.com.siteware.sitewareProduto.CarrinhoDeCompras.application.api;

import br.com.siteware.sitewareProduto.produto.domain.Produto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Component
@Service
public class CarrinhoDeCompras {
    private List<Produto> produtosNoCarrinho = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtosNoCarrinho.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtosNoCarrinho.remove(produto);
    }

    public List<Produto> listarProdutosNoCarrinho() {
        return produtosNoCarrinho;
    }

    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (Produto produto : produtosNoCarrinho) {
            valorTotal = valorTotal.add(produto.getPrecoTotal());
        }
        return valorTotal;
    }

    public void concluirCompra() {
        produtosNoCarrinho.clear();
    }

    public void limparCarrinho() {
        produtosNoCarrinho.clear();
    }
}
