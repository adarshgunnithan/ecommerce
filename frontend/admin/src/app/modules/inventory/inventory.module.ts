import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddproductComponent } from './components/addproduct/addproduct.component';
import { ListproductComponent } from './components/listproduct/listproduct.component';
import { DeleteproductComponent } from './components/deleteproduct/deleteproduct.component';
import { SearchproductComponent } from './components/searchproduct/searchproduct.component';
import {InventoryAppRoutingModule} from '../inventory/inventory-router.module';

@NgModule({
  declarations: [AddproductComponent, ListproductComponent, DeleteproductComponent, SearchproductComponent],
  imports: [
    CommonModule,
    InventoryAppRoutingModule
  ]
})
export class InventoryModule { }
