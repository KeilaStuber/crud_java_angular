import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './views/home/home.component';
import {UsuarioCrudComponent} from './views/usuario-crud/usuario-crud.component';
import { UserCreateComponent } from './components/user/user-create/user-create.component';
import { UserUpdateComponent } from './components/user/user-update/user-update.component';
import { UserDeleteComponent } from './components/user/user-delete/user-delete.component';


const routes: Routes = [{
  path: "",
  component: HomeComponent
},
{
  path: "usuarios",
  component: UsuarioCrudComponent
},

{
  path:"user/create",
  component: UserCreateComponent
},

{
  path:"usuarios/update/:id",
  component: UserUpdateComponent
},

{
  path:"usuarios/delete/:id",
  component: UserDeleteComponent
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
