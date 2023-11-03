package br.com.siteware.sitewareProduto.application.api;

import br.com.siteware.sitewareProduto.domain.Produto;
import br.com.siteware.sitewareProduto.domain.StatusPromocao;

import java.util.List;

public class ProdutoListResponse {
    private String nome;
    private String preco;
    private StatusPromocao statusPromocao;

    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return null;
    }
}
