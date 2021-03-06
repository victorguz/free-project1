package com.free.project1.main.controller.mantenimiento;

import com.free.project1.main.interfaces.mantenimiento.IDepartamento;
import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.ITipoMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.ITipoProcedimientoAdjudicado;
import com.free.project1.main.interfaces.mantenimiento.IUnidadEstructural;
import com.free.project1.main.model.mantenimiento.view.MantenimientoView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MantenimientosController {

    @Autowired
    private IMantenimiento _mnt;

    @Autowired
    private ITipoMantenimiento _tipo_mnt;

    @Autowired
    private IDepartamento _dptos;

    @Autowired
    private IUnidadEstructural _unidades;

    @Autowired
    private ITipoProcedimientoAdjudicado _procedimientos;

    Logger LOG = LoggerFactory.getLogger(MantenimientosController.class);

    @GetMapping("/")
    public String home(Model model) {
        Pageable mnt_limit = PageRequest.of(0, 100000, Sort.by(Direction.DESC, "id_mantenimiento"));
        Pageable unity_limit = PageRequest.of(0, 100000, Sort.by(Direction.ASC, "unidad"));
        Pageable dptos_limit = PageRequest.of(0, 100000, Sort.by(Direction.ASC, "departamento"));
        model.addAttribute("list", MantenimientoView.toList(_mnt.findAll(mnt_limit).getContent()));
        model.addAttribute("dptos", _dptos.selectAll(dptos_limit));
        model.addAttribute("unidades", _dptos.selectUnidades(unity_limit));
        model.addAttribute("details_url", "/details");
        model.addAttribute("search_url", "/search");
        model.addAttribute("add_url", "/add");
        model.addAttribute("all_url", "/api/maintenances/all");
        model.addAttribute("total_url", "/api/maintenances/total");
        model.addAttribute("unidades_url", "/api/maintenances/getUnidades");
        model.addAttribute("unidades_by_dpto_url", "/api/maintenances/getUnidadesByDepartamento");

        return "index";
    }

    @GetMapping("/details")
    public String details(Model model, @RequestParam int id) {
        model.addAttribute("get_detail_url", "/api/maintenances/getDetail");
        model.addAttribute("update_url", "/update");
        model.addAttribute("add_url", "/add");
        model.addAttribute("mnt", new MantenimientoView(_mnt.findById(id).get()));
        return "details";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("dptos", _dptos.selectAll());
        model.addAttribute("unidades", _unidades.findAll());
        model.addAttribute("procedimientos", _procedimientos.findAll());
        model.addAttribute("tipos", _tipo_mnt.findAll());
        model.addAttribute("update_url", "/update");
        model.addAttribute("add_url", "/add");
        return "add";
    }

    @PutMapping("/update")
    public String update(Model model) {
        return "update";
    }
}
