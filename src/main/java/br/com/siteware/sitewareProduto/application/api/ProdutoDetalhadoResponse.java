package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.domain.StatusPromocao;

import java.time.LocalDateTime;

public class ProdutoDetalhadoResponse {
    private String nome;
    private String preco;
    private StatusPromocao statusPromocao;

    private LocalDateTime dataHoraDoCadastro;
}
