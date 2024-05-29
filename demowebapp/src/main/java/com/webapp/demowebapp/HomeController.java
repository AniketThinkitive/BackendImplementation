package com.webapp.demowebapp;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Alien alien)
    {

        ModelAndView mv=new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
        return  mv;




    //////used when get few parameters from users
//    public ModelAndView home(@RequestParam("name") String myname)
//      {
//
//        ModelAndView mv=new ModelAndView();
//       ////used for single value
//        //// mv.addObject("name",myname);
//
//        mv.setViewName("home");
//          return  mv;

   //// no use of this instead we use modelandview
//    public  String home(String name,HttpSession session)
//            //@RequestPaaram ("name") used when multipale parameters
//    {
//HttpServletRequest req, HttpServletResponse res)
//        this also not needed in spring boot mvc
//    //in servlet we used create object of httpserveltrequest
//
//
//        //used to create session and send data to print on home page
//        HttpSession session=req.getSession();
//        String name=req.getParameter("name");
////        int num=hsr.getParameter('num');
//        //int num = Integer.parseInt(request.getParameter("num"));
//
//        //data coming from url maybe by resquest disphacher or rssponse.
//        System.out.println("hiii "+name);
//        session.setAttribute("name",name);
//
//            return "home";






    }

}
