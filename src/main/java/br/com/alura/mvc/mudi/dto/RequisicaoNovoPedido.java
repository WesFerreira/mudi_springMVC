package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

public record RequisicaoNovoPedido(

        String nomeProduto,
        String urlProduto,
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
