package kz.ilan.rusandlit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/index")
    public String indexx() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }

    @GetMapping("/second-page")
    public String secondPage() {
        return "second-page";
    }

    @GetMapping("/rus_rules")
    public String rusRules() {
        return "rus_rules";
    }
    @GetMapping("/lit_rules")
    public String litRules() {
        return "lit_rules";
    }
    @GetMapping("/news1")
    public String news1() {
        return "news1";
    }
    @GetMapping("/news2")
    public String news2() {
        return "news2";
    }
    @GetMapping("/news3")
    public String news3() {
        return "news3";
    }
    @GetMapping("/org")
    public String news4() {
        return "org";
    }
    @GetMapping("/lecs")
    public String news5() {
        return "lecs";
    }
    @GetMapping("/books")
    public String news6() {
        return "books";
    }
}
