import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import{FrontendComponent} from "./frontend/frontend.component";


const routes: Routes = [
  {path: 'front' ,component:FrontendComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
