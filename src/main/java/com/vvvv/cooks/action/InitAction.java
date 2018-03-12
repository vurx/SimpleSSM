package com.vvvv.cooks.action;

import com.vvvv.cooks.CooksService;
import com.vvvv.cooks.componses.page.PageBean;
import com.vvvv.cooks.vo.Cooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class InitAction {

    @Autowired
    private CooksService cooksService;

    @RequestMapping("/init.do")
    public String init(@RequestParam(required = false, defaultValue = "1") int cp, HttpServletRequest request) {
        PageBean<Cooks> bean = cooksService.findBean(cp);
        request.setAttribute("pb", bean);
        return "index";
    }
}
