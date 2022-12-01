package mvcatv.controllers;

import mvcatv.models.Receita;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/receitas")
public class ReceitaController {

  private static final List<Receita> receitas = new ArrayList<Receita>();

  public ReceitaController(){
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
    public String getReceita(Model model)
   {
       model.addAttribute("receitas", receitas);
       return "receitas";
   }
}
