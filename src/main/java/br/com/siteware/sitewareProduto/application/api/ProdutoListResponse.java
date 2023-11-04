package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.domain.Produto;
import br.com.siteware.sitewareProduto.domain.StatusPromocao;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Value
public class ProdutoListResponse {
    private UUID idProduto;
    private String nome;
    private String preco;
    private StatusPromocao statusPromocao;

    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return produtos.stream()
                .map(ProdutoListResponse::new)
                .collect(Collectors.toList());
    }

    public ProdutoListResponse(Produto produto) {
        this.idProduto= produto.getIdProduto();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.statusPromocao = produto.getStatusPromocao();
    }
}
