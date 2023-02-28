package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;
import jakarta.validation.constraints.NotBlank;

public record RequisicaoNovoPedido(

        @NotBlank
        String nomeProduto,
        @NotBlank
        String urlProduto,
        @NotBlank
        String urlImagem,
        String descricao
) {
    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setDescricao(descricao);
        return pedido;
    }
}
