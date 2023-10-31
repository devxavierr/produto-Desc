package br.com.siteware.sitewareProduto.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/produto")
public interface ProdutoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    ProdutoResponse postProduto(@RequestBody ProdutoRequest produtoRequest);
}
