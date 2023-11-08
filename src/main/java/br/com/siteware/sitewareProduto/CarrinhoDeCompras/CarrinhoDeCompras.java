package br.com.siteware.sitewareProduto.CarrinhoDeCompras;

import br.com.siteware.sitewareProduto.produto.domain.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
            valorTotal = valorTotal.add(produto.getPreco());
        }
        // Aplicar promoções, se houver
        // valorTotal = aplicarPromocoes(valorTotal);
        return valorTotal;
    }

    public void concluirCompra() {
        // Processar o pagamento e esvaziar o carrinho
        produtosNoCarrinho.clear();
    }
}