package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Samsung Galaxy S23");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/61XWTf2no8L._AC_SL1500_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Samsung-Galaxy-Snapdragon-C%C3%A2mera-Tripla/dp/B0BRT4SYBW?ref_=ast_sto_dp&th=1&psc=1");
        pedido.setDescricao("Uma descrição qualquer para esse pedido");

        List<Pedido> pedidos =Arrays.asList(pedido);

        model.addAttribute("pedidos", pedidos);

        return "home";
    }

}
