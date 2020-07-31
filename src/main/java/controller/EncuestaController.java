package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import service.EncuestaService;

@Controller
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService;

    public String viewHomePage(Model model){
        model.addAttribute("listEncuestas", encuestaService.getAllEncuestas());
        return "index";
    }








}
