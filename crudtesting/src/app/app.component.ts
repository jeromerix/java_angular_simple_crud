import { Component } from '@angular/core';
import {Employee} from "./employee";
import {EmployeeService} from './employee.service'
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'crudtesting';
  //items van Employees aanroepen
  public employees: Employee[];

  constructor(private employeeService: EmployeeService) {
  }

//get methode wordt aangeroepen
  ngOnInit() {
    this.getEmployees();
  }

  public getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {
        this.employees = response;
        console.log(this.employees);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
