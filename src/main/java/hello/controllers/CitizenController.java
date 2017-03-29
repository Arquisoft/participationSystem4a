package hello.controllers;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.domain.Citizen;
import hello.producers.KafkaProducer;
import hello.services.CitizenServices;

/**
 * Created by pelay on 28/03/2017.
 */
@Controller
@Scope("session")
public class CitizenController {

    @Autowired
    private KafkaProducer kafkaProducer;
    Citizen citizen;

    private CitizenServices citizenService;

    @Autowired
    public void setCitizenService(CitizenServices citizenService){
        this.citizenService =citizenService;
    }
/*
    @RequestMapping("/")
    public String landing(Model model) {
        // model.addAttribute("message", new Message());
        return "index";
    }
*/

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String getLogin(@RequestParam String email, @RequestParam String password, Model model){

        Citizen citizen = citizenService.getCitizen(email);

        if(citizen!=null){
            if(DigestUtils.sha512Hex(password).equals(citizen.getContrasena())){
                //session.setAttribute("citizen",citizen);
                return "/user/index";

            }
        }
        model.addAttribute("error", "Your username and password is invalid.");
        return "index";

    }
    /*
    @RequestMapping("/send")
    public String send(Model model, @ModelAttribute Message message) {
        kafkaProducer.send("exampleTopic", message.getMessage());
        return "redirect:/";
    }
*/
}
