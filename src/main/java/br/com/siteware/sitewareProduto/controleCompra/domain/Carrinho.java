package br.com.siteware.sitewareProduto.controleCompra.domain;

import br.com.siteware.sitewareProduto.produto.domain.StatusPromocao;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCarrinho", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String produtoCarrinho;
    private String quantidade;
    private StatusPromocao statusPromocao;

    private LocalDateTime dataHoraDaCriacao;
    private LocalDateTime dataHoraDaUltimaAlteracao;
}
