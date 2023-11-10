package br.com.siteware.sitewareProduto.CarrinhoDeCompras.application.api;

import br.com.siteware.sitewareProduto.produto.application.api.ProdutoAlteracaoRequest;
import br.com.siteware.sitewareProduto.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;
@RestController
@Log4j2
@RequiredArgsConstructor
public class CarrinhoController implements CarrinhoAPI {
    private final CarrinhoDeCompras carrinhoDeCompras;

    @Override
    public void adicionarProdutoAoCarrinho(@Valid @RequestBody ProdutoAlteracaoRequest produtoRequest) {
        Produto produto = new Produto(produtoRequest);
        carrinhoDeCompras.adicionarProduto(produto);
    }

    @Override
    public List<Produto> listarProdutosNoCarrinho() {
        return carrinhoDeCompras.listarProdutosNoCarrinho();
    }

    @Override
    public BigDecimal calcularValorTotalDoCarrinho() {

        return carrinhoDeCompras.calcularValorTotal();
    }

    @Override
    public void limparCarrinho() {
        carrinhoDeCompras.limparCarrinho();
    }
}
