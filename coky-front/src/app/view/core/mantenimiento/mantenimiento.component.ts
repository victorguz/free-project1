import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UsersConfigModule } from 'src/app/config/maintenances.config';
import { MantenimientoI } from 'src/app/models/maintenance.model';
import { MantenimientosService } from 'src/app/services/mantenimientos.service';

@Component({
  selector: 'app-mantenimiento',
  templateUrl: './mantenimiento.component.html',
  styleUrls: ['./mantenimiento.component.scss']
})
export class MantenimientoComponent implements OnInit {
  //To datatable
  detailsRoute = func.generateRoute('admin', '/maintenances');
  columns = [
    // { title: 'Id', data: "id" },
    {
      title: 'Item',
      render: function (data: any, type: any, full: any, index: number) {
        return index["row"] + 1;
      }
    },
    { title: 'Username', data: "username" },
    { title: 'Email', data: "email" },
    // { title: 'Actions', data: "" },
  ]

  //Users
  maintenances: MantenimientoI[] = [];
  detailsUser: MantenimientoI;
  editUser: MantenimientoI;
  //Route Params:
  method: string = "";
  id: number = 0;

  //User select properties
  constructor(private maintenancesService: MantenimientosService, private activeRoute: ActivatedRoute) {
    activeRoute.params.subscribe(result => {
      if (result.id) {
        this.id = result.id;
        this.setUser();
      }
    })
  }

  async ngOnInit() {
    this.loadAll()
  }

  async loadAll() {
    try {
      let result = await this.maintenancesService.orderby("id", "desc", 50, 0);
      this.maintenances = result.result;
    } catch (error) {
      console.log(error)
    }
  }
  async setUser() {
    try {
      this.detailsUser = await this.maintenancesService.getOne(this.id);
      this.editUser = this.detailsUser;
      console.log(this.editUser)
    } catch (error) {
      console.log(error)
    }
  }

  get(type, value): string {
    switch (type) {
      case "role": return UsersConfigModule.getRoleName(value);
      case "status": return UsersConfigModule.getStatusName(value);
    }
  }
}
