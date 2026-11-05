package br.com.senai.cadastro_eventos.controller;

import br.com.senai.cadastro_eventos.model.evento;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;


@Controller
public class eventoController {

    @GetMapping("/evento")
    public String exibirFormulario(Model model) {

        model.addAttribute("evento", new evento());

        return "formulario-evento";
    }

    @PostMapping("/evento")
    public String processarFormulario(
            @ModelAttribute("Evento") evento evento,
            BindingResult resultado) {

        if (resultado.hasErrors()) {
            return "evento";
        }

        return "redirect:/sucesso";
    }

    @GetMapping("/sucesso")
    public String exibirSucesso() {

        return "sucesso";
    }
}
