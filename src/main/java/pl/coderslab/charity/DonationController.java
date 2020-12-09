package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonationController {

    @GetMapping("/form")
    public String formAction() {
        return "/form";
    }

}
