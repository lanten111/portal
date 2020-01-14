//package com.student.portal.controller;
//
//import com.student.portal.domain.User;
//import com.student.portal.domain.UserDetails;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.support.SessionStatus;
//
//import javax.servlet.http.HttpSession;
//
//
//@SessionAttributes("CurrentUser")
//@Controller
//public class LoginController {
//
//    private static final Logger log = LogManager.getLogger(LoginController.class);
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(){
//        return "login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String loginError(Model model){
//        log.info("Login attempt failed");
//        model.addAttribute("error", "true");
//        return "login";
//    }
//
//    @RequestMapping(value = "/logout", method = RequestMethod.GET)
//    public String logout(SessionStatus sessionStatus){
//        SecurityContextHolder.getContext().setAuthentication(null);
//        sessionStatus.setComplete();
//        return "redirect:welcome";
//    }
//
//    @RequestMapping(value = "/postLogin", method = RequestMethod.GET)
//    public String postLogin(Model model, HttpSession httpSession){
//        log.info("postLogin(");
//        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
//        validatePrinciple(authentication.getPrincipal());
//        User loggedInUser = ((UserDetails) authentication.getPrincipal()).getUserDetails();
//        model.addAttribute("currentUser", loggedInUser);
//        httpSession.setAttribute("userid", loggedInUser.getId() );
//        return "redirect:/wallPage";
//    }
//
//    private void validatePrinciple(Object principal){
//        if (!(principal instanceof UserDetails)){
//            throw new IllegalArgumentException("aa");
//        }
//    }
//
//
//}
