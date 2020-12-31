package com.free.project1.main.controller.mantenimiento;

import java.util.List;

import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.model.mantenimiento.Mantenimiento;
import com.free.project1.main.services.mantenimiento.MantenimientosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MantenimientosController {

    @Autowired
    private IMantenimiento repo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("list", repo.findAll());
        return "index";
    }

    @GetMapping("/details")
    public String details(@RequestParam int id, Model model) {
        model.addAttribute("details", repo.findById(id));
        return "details";
    }

}
