package br.com.siteware.sitewareProduto.controleCompra.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/v1/produto/{idProduto}/carrinho")
public interface CarrinhoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CarrinhoResponse postCarrinho(@PathVariable UUID idProduto,
                                  @Valid @RequestBody CarrinhoRequest carrinhoRequest);
}
