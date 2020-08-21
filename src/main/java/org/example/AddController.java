package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping("sqrt")
    public ModelAndView add(@RequestParam ("x") int x)
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("result","Your sqrt is: "+Math.sqrt(x));
        return mv;
    }
    @RequestMapping("/")
    public ModelAndView index()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("result","Find the Sqrt of a number");
        return mv;
    }
}
