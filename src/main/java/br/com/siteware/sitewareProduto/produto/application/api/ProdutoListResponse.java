package br.com.siteware.sitewareProduto.produto.application.api;

import br.com.siteware.sitewareProduto.produto.domain.Produto;
import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Value
public class ProdutoListResponse {
    private UUID idProduto;
    private String nome;
    private Integer quantidadeProduto;
    private Float preco;
    private StatusPromocao statusPromocao;

    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return produtos.stream()
                .map(ProdutoListResponse::new)
                .collect(Collectors.toList());
    }

    public ProdutoListResponse(Produto produto) {
        this.idProduto= produto.getIdProduto();
        this.nome = produto.getNomeProduto();
        this.quantidadeProduto = produto.getQuantidadeProduto();
        this.preco = Float.valueOf(String.valueOf(produto.getPreco()));
        this.statusPromocao = produto.getStatusPromocao();
    }
}
