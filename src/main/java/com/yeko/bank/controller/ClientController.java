package com.yeko.bank.controller;

import com.yeko.bank.model.entity.Client;
import com.yeko.bank.service.ClientService;
import com.yeko.bank.service.impl.ClientServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {

  @Autowired
  private ClientService clientService;

  @RequestMapping(value = "/")
  public String startPage() {
    return "startpage";
  }

  @RequestMapping(value = "/clients", method = RequestMethod.GET)
  public String clients(Model model) {
    List<Client> clients = clientService.getAll();
    model.addAttribute("clients", clients);
    return "clients";
  }

  @RequestMapping(value = "/add-client", method = RequestMethod.GET)
  public String addClient() {
    return "add-client";
  }

  @ModelAttribute("client")
  public Client newClient() {
    return new Client();
  }

  @RequestMapping(value = "/clients", method = RequestMethod.POST)
  public String addClient(@ModelAttribute("client") Client client) {
    clientService.add(client);
    return "redirect:clients";
  }

}
