import { Component } from '@angular/core';
import {Employee} from "./service/employee";
import {EmployeeService} from './service/employee.service'
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'crudtesting';

  //items van Employees aanroepen
  public employees: Employee[] | undefined;

  constructor(private employeeService: EmployeeService) {
  }

  //get methode wordt aangeroepen
  ngOnInit() {
    this.getEmployees();
  }

  // schijnbaar depricated moet nog anders
  public getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {this.employees = response; console.log(this.employees);},
      (error: HttpErrorResponse) => {alert(error.message);}
    );}
}
