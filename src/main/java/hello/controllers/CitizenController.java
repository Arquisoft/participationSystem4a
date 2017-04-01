package hello.controllers;

import hello.domain.Categoria;
import hello.domain.Citizen;
import hello.domain.Sugerencia;
import hello.services.CategoryService;
import hello.services.CitizenService;
import hello.services.SuggestionService;
import hello.util.exception.CitizenException;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by pelay on 28/03/2017.
 */
@Controller
@Scope("session")
public class CitizenController {


    /*private KafkaProducer kafkaProducer;
    private Citizen citizen;*/
    private String idCat="all";


    private CitizenService citizenService;
    private SuggestionService suggestionService;
    private CategoryService categoryService;

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Autowired
    public void setCitizenService(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @Autowired
    public void setSuggestionService(SuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }
/*
    @RequestMapping("/")
    public String landing(Model model) {
        // model.addAttribute("message", new Message());
        return "index";
    }
*/

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String getLogin(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {

        Citizen citizen = citizenService.getCitizen(email);

        if (citizen != null) {
            if (DigestUtils.sha512Hex(password).equals(citizen.getContrasena())) {
                session.setAttribute("citizen", citizen);
                List<Sugerencia> listaSugerencias = getSugerencias(null);
                session.setAttribute("listaSugerencias", listaSugerencias);
                session.setAttribute("listaCategorias",categoryService.findAll() );


                return "/user/index";

            }
        }
        model.addAttribute("error", "Your username and password is invalid.");
        return "index";


    }

    @RequestMapping(value = "/cat")
    public String getSugerenciasCat(@RequestParam String idCat, HttpSession session, Model model) {
        this.idCat=idCat;
        putSugerenciasInSession(session);


       return "/user/index";
    }

    private void putSugerenciasInSession(HttpSession session) {
        if(idCat.equals("all")){
            session.setAttribute("listaSugerencias", suggestionService.findAll());
        }
        else{
            Long id = Long.parseLong(idCat);
            Categoria cat = categoryService.findById(id);
            session.setAttribute("listaSugerencias", suggestionService.findByCat(cat));

        }
    }


    /*
    @RequestMapping("/send")
    public String send(Model model, @ModelAttribute Message message) {
        kafkaProducer.send("exampleTopic", message.getMessage());
        return "redirect:/";
    }
*/

    @RequestMapping(value = "/vote+", method = RequestMethod.POST)
    public String votePos(@RequestParam String idSug, HttpSession session) {

        Long id=Long.parseLong(idSug);
        Sugerencia sugerencia = suggestionService.findById(id);
        Citizen citizen=(Citizen) session.getAttribute("citizen");
        try {
            suggestionService.votePositiveSugerencia(sugerencia, citizen);
        } catch (CitizenException e) {

        }
        putSugerenciasInSession(session);


        return "/user/index";
    }

    @RequestMapping(value = "/vote-", method = RequestMethod.POST)
    public String voteNeg(@RequestParam String idSug, HttpSession session) {

        Long id=Long.parseLong(idSug);
        Sugerencia sugerencia = suggestionService.findById(id);
        Citizen citizen=(Citizen) session.getAttribute("citizen");
        try {
            suggestionService.voteNegativeSugerencia(sugerencia, citizen);
        } catch (CitizenException e) {

        }
        putSugerenciasInSession(session);


        return "/user/index";
    }

    @RequestMapping(value="/sug")
    public String viewSug(@RequestParam String idSug,Model model){
        Long id=Long.parseLong(idSug);
        Sugerencia sugerencia = suggestionService.findById(id);
        model.addAttribute("sugerencia",sugerencia);
        return "/user/viewSuggestion";

    }


    private List<Sugerencia> getSugerencias(Categoria c) {
        if (c == null) {

            return suggestionService.findAll();
        } else {
            return suggestionService.findByCat(c);

        }
    }



}
