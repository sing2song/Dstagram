package ac.dankook.dstagram2.controller;

import ac.dankook.dstagram2.data.Dstagram;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String index(){
        return "redirect:/portfolio";
    }
    @RequestMapping("index")
    public String index1(){
        return "index";
    }

    @RequestMapping("template")
    public String getTemplate(Model model){//model : 페이지 전체를 가져올때, 부분적으로는 못가져옴
        Dstagram dstagram=  new Dstagram();

        dstagram.setTitle("Dstagram");
        dstagram.setAuth("Songwon");

        model.addAttribute("dstagram",dstagram);

        return "template";
    }
    @RequestMapping("blog")
    public String getTemplate2(Model model){
        Dstagram dstagram=  new Dstagram();

        dstagram.setTitle("Dstagram");

        model.addAttribute("dstagram",dstagram);

        return "blog";
    }
    @RequestMapping("portfolio")
    public String getTemplate3(Model model){
         Dstagram dstagram=  new Dstagram();

        dstagram.setTitle("Dstagram");

        model.addAttribute("dstagram",dstagram);

        return "portfolio";
    }
    @RequestMapping("simplyme")
    public String getTemplate4(Model model){
        Dstagram dstagram=  new Dstagram();

        dstagram.setTitle("Dstagram");
        model.addAttribute("dstagram",dstagram);

        return "simplyme";
    }
}
