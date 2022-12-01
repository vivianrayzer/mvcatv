package mvcatv.controllers;

import mvcatv.models.Receita;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
 @RequestMapping("/api/receitas")
public class ReceitaApiController {
    private static final List<Receita> receitas = new ArrayList<Receita>();

    public ReceitaApiController(){
        receitas.add(new Receita("Pavê de chocolate ", " Doce"));
        receitas.add(new Receita("Fricassê de frango ", " Salgado"));
        receitas.add(new Receita("Bolo de laranja ", " Doce"));
        receitas.add(new Receita("Pizza ", " Salgado"));
        receitas.add(new Receita("Lasanha ", " Salgado"));
        receitas.add(new Receita("Beijinho ", " Doce"));
        receitas.add(new Receita("Panqueca ", " Salgado"));
        receitas.add(new Receita("Churros ", " Doce"));
        receitas.add(new Receita("Bolinho de chuva", " Doce"));
    }
    @GetMapping
    public List<Receita> getReceita(){
        return receitas;
    }
  
}
