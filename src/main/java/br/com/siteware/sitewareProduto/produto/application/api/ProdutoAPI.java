package br.com.siteware.sitewareProduto.produto.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/produto")
public interface ProdutoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProdutoResponse postProduto(@Valid @RequestBody ProdutoAlteracaoRequest produtoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ProdutoListResponse> getTodosProdutos();

    @GetMapping(value = "/{idProduto}")
    @ResponseStatus(code = HttpStatus.OK)
    ProdutoDetalhadoResponse getProdutoAtravesId(@PathVariable UUID idProduto);

    @DeleteMapping(value = "/{idProduto}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaProdutoAtravesId(@PathVariable UUID idProduto);

    @PatchMapping(value = "/{idProduto}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraProduto(@PathVariable UUID idProduto,
                            @Valid @RequestBody ProdutoAlteracaoRequest produtoAlteracaoRequest);
}
