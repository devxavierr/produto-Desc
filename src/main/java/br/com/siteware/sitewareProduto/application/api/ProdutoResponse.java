package br.com.siteware.sitewareProduto.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Value
@Builder
public class ProdutoResponse {
    private UUID idProduto;
}
