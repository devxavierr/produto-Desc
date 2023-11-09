package br.com.siteware.sitewareProduto.produto.application.api;

import br.com.siteware.sitewareProduto.produto.domain.Produto;
import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ProdutoDetalhadoResponse {
    private UUID idProduto;
    private String nome;
    private Integer quantidadeProduto;
    private BigDecimal preco;
    private StatusPromocao statusPromocao;
    private BigDecimal precoTotal;

    private LocalDateTime dataHoraDoCadastro;

    public ProdutoDetalhadoResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNomeProduto();
        this.quantidadeProduto = produto.getQuantidadeProduto();
        this.preco = produto.getPreco();
        this.statusPromocao = produto.getStatusPromocao();
        this.dataHoraDoCadastro = produto.getDataHoraDoCadastro();
        this.precoTotal = produto.getPrecoTotal();
    }

}
