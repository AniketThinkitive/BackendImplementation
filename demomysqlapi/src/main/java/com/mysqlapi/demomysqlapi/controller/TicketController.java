package com.mysqlapi.demomysqlapi.controller;

import com.mysqlapi.demomysqlapi.dao.TicketDao;
import com.mysqlapi.demomysqlapi.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class TicketController {
    @Autowired
    private TicketDao ticketDao;


    @PostMapping("/bookTicket")
    public Ticket bookTicket(@RequestBody Ticket t1){
        Ticket t = ticketDao.save(t1);
        return t;
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return ticketDao.findAll();
    }


    @GetMapping("/getTicket/{id}")
    public Ticket getTicket(@PathVariable int id){
        Ticket ticket= ticketDao.findById(id).get();
        return ticket;
    }



    @DeleteMapping("/cancleTicket/{id}")
    public Ticket cancleTicket(@PathVariable int id){
      Ticket ticket=  ticketDao.findById(id).get();
      ticketDao.delete(ticket);
      return ticket;
    }



//    @PutMapping("/updateTicket/{id}")
//    public String updateTicket(@PathVariable int id,@RequestBody Ticket t1){
//        Ticket existingTicket = ticketDao.findById(id);
//        if (existingTicket != null) {
//            existingTicket.setAmount(updatedTicket.getAmount());
//            ticketDao.save(existingTicket);
//            return "Ticket updated successfully";
//        } else {
//            return "Ticket not found with id: " + id;
//        }
//
//    }


//    @PutMapping("/updateTicket/{id}")
//    public String updateTicket(@PathVariable int id, @RequestBody Ticket updatedTicket) {
//        Ticket existingTicket = ticketDao.findById(id).orElse(null);
//           existingTicket.setAmount(updatedTicket.getAmount());
//            ticketDao.save(existingTicket);
//
//            return existingTicket;
//        }
//    }




    @PutMapping("/update/{id}")
    public Ticket updateStudents(@PathVariable int id,@RequestBody Ticket updatedTicket) {
        Ticket ticket = ticketDao.findById(id).get();
        ticket.setAmount(updatedTicket.getAmount());
        ticketDao.save(ticket);
        return ticket;
}




}


