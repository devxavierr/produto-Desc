package br.com.siteware.sitewareProduto.controleCompra.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@Log4j2
public class CarrinhoController implements CarrinhoAPI {
    @Override
    public CarrinhoResponse postCarrinho(UUID idProduto, CarrinhoRequest carrinhoRequest) {
        log.info("[inicia] CarrinhoController - postCarrinho");
        log.info("[idParoduto] {}", idProduto);
        log.info("[finaliza] CarrinhoController - postCarrinho");
        return null;
    }
}
