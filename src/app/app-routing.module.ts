import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainLayoutComponent } from './Layouts/main-layout/main-layout.component';
import { ItemsComponent } from './pages/items/items.component';
import { OutItemsComponent } from './pages/out-items/out-items.component';
import { NewItemsComponent } from './pages/new-items/new-items.component';
import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
const routes: Routes = [
  {
    path:'',
    component:LoginComponent,
children:[
  {
    path:'',
  component:MainLayoutComponent,
  },
  {
    path:'items',
    component:ItemsComponent
  
  },
  
  {
    path:'out-items',
    component:OutItemsComponent
  },
  {
    path:'new-items',
    component:NewItemsComponent
  },
 
]

},
{
  path:'main-layout',
  component:MainLayoutComponent
},
{
  path:'**',redirectTo:'/main-layout',pathMatch:'full'
},
{
  path:'',redirectTo:'/',pathMatch:'full'
},
{
  path: 'dashboard',
  //component:ItemsComponent
  component: DashboardComponent
},
{
  path:'**',redirectTo:'/dashboad',pathMatch:'full'
},
{
  path:'',redirectTo:'/dashboad',pathMatch:'full'
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
