package br.com.siteware.sitewareProduto.CarrinhoDeCompras;

import br.com.siteware.sitewareProduto.produto.application.api.ProdutoAlteracaoRequest;
import br.com.siteware.sitewareProduto.produto.domain.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;
@RestController
@RequestMapping("/v1/produto/carrinho")
public interface CarrinhoAPI {
    @PostMapping("/adicionar")
    @ResponseStatus(code = HttpStatus.CREATED)
    void adicionarProdutoAoCarrinho(@Valid @RequestBody ProdutoAlteracaoRequest produtoRequest);

    @GetMapping("/listar")
    @ResponseStatus(code = HttpStatus.OK)
    List<Produto> listarProdutosNoCarrinho();

    @GetMapping("/valor-total")
    @ResponseStatus(code = HttpStatus.OK)
    BigDecimal calcularValorTotalDoCarrinho();

    @DeleteMapping("/limpar")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void limparCarrinho();

    // Outros métodos e endpoints para operações no carrinho
}

