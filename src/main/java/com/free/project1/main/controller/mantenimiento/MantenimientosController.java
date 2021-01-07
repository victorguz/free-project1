package com.free.project1.main.controller.mantenimiento;

import com.free.project1.main.interfaces.mantenimiento.ICicloMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IDetalleMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IEstadoMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IRequiereMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.ITipoMantenimiento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MantenimientosController {

    @Autowired
    private IMantenimiento mnt;
    @Autowired
    private ICicloMantenimiento ciclo_mnt;
    @Autowired
    private IDetalleMantenimiento detalle_mnt;
    @Autowired
    private IEstadoMantenimiento estado_mnt;
    @Autowired
    private IRequiereMantenimiento requiere_mnt;
    @Autowired
    private ITipoMantenimiento tipo_mnt;

    Logger LOG = LoggerFactory.getLogger(MantenimientosController.class);

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("details_url", "/details");
        model.addAttribute("add_url", "/add");
        model.addAttribute("all_url", "/api/maintenances/all");
        return "index";
    }

    @GetMapping("/details")
    public String details(Model model, @RequestParam int id) {
        var x = mnt.findById(id).get();
        model.addAttribute("details_url", "/allDetails");
        model.addAttribute("update_url", "/update");
        model.addAttribute("add_url", "/add");
        model.addAttribute("mnt", x);
        model.addAttribute("tipos", tipo_mnt.findAll());
        return "details";
    }

    @PostMapping("/add")
    public String add(Model model) {
        return "update";
    }

    @PutMapping("/update")
    public String update(Model model) {
        return "update";
    }
}
