/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author shedler
 */
@Controller
public class OlaMundoController {

  @RequestMapping("/olaMundoSpring")
  public String execute() {
      System.out.println("Executando a lógica com Spring MVC");
      return "ok";
  }
}
