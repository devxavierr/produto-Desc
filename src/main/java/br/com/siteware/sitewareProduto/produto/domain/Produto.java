package br.com.siteware.sitewareProduto.produto.domain;

import br.com.siteware.sitewareProduto.produto.application.api.ProdutoAlteracaoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idProduto;
    @NotBlank
    @Column(unique = true)
    private String nomeProduto;
    private Integer quantidadeProduto;
    @NotNull
    private BigDecimal preco;
    private StatusPromocao statusPromocao;
    private BigDecimal precoTotal;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Produto(ProdutoAlteracaoRequest produtoRequest) {
        this.nomeProduto = produtoRequest.getNome();
        this.quantidadeProduto = produtoRequest.getQuantidadeProduto();
        this.preco = produtoRequest.getPreco();
        this.statusPromocao = produtoRequest.getStatusPromocao();
        this.dataHoraDoCadastro = LocalDateTime.now();
        this.precoTotal = statusPromocao.aplicarPromocao(produtoRequest);
    }



    public void altera(ProdutoAlteracaoRequest produtoAlteracaoRequest) {
        this.nomeProduto = produtoAlteracaoRequest.getNome();
        this.quantidadeProduto = produtoAlteracaoRequest.getQuantidadeProduto();
        this.preco = produtoAlteracaoRequest.getPreco();
        this.statusPromocao = produtoAlteracaoRequest.getStatusPromocao();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
    }

}
