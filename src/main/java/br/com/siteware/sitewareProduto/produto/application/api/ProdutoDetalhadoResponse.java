package br.com.siteware.sitewareProduto.produto.application.api;

import br.com.siteware.sitewareProduto.produto.domain.Produto;
import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ProdutoDetalhadoResponse {
    private UUID idProduto;
    private String nome;
    private String preco;
    private StatusPromocao statusPromocao;

    private LocalDateTime dataHoraDoCadastro;

    public ProdutoDetalhadoResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.statusPromocao = produto.getStatusPromocao();
        this.dataHoraDoCadastro = produto.getDataHoraDoCadastro();
    }

}
