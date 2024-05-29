package com.mysqlapi.demomysqlapi.dao;

import com.mysqlapi.demomysqlapi.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TicketDao extends JpaRepository<Ticket,Integer> {



}
