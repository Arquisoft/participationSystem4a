package hello.controllers;

import hello.producers.KafkaProducer;
import hello.services.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by pelay on 28/03/2017.
 */
@Controller
public class CitizenController {

    @Autowired
    private KafkaProducer kafkaProducer;

    private CitizenService citizenService;

    @Autowired
    public void setCitizenService(CitizenService citizenService){
        this.citizenService=citizenService;
    }
/*
    @RequestMapping("/")
    public String landing(Model model) {
        // model.addAttribute("message", new Message());
        return "index";
    }

/*
    @RequestMapping("/login")
    public String getLogin(HttpSession session, @RequestParam String email, @RequestParam String password, Model model){

        Citizen citizen = citizenService.getCitizen(email);

        if(citizen!=null){
            if(DigestUtils.sha512Hex(citizen.getContrasena()).equals(password)){
                session.setAttribute("citizen",citizen);
                return "/user/index";

            }
        }
        return "login";

    }
    /*
    @RequestMapping("/send")
    public String send(Model model, @ModelAttribute Message message) {
        kafkaProducer.send("exampleTopic", message.getMessage());
        return "redirect:/";
    }
*/
}
