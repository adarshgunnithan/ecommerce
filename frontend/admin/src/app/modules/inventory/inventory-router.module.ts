import { NgModule } from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import {AddproductComponent} from '../inventory/components/addproduct/addproduct.component';
import {ListproductComponent} from '../inventory/components/listproduct/listproduct.component';



const inventoryRoutes :Routes=[
    {
        path:'products',
        children:[
            {
              path :'',
              redirectTo:'/list',
              pathMatch:'full'
             
          },{
            path :'add-product',
            component: AddproductComponent,
          },{
              path:'list',
              component:ListproductComponent,
          }
        ]
}


];

@NgModule({
    imports: [
     
        RouterModule.forRoot(inventoryRoutes)
    ]
  })
  export class InventoryAppRoutingModule { 
  
  
  
  }