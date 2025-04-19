package org.church.camp_registration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/")
public class DefaultController {
    @GetMapping()
    public RedirectView redirectToSwagger() {
        return new RedirectView("/swagger-ui/index.html#/");
    }
}
