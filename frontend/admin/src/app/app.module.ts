import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import {InventoryModule} from '../app/modules/inventory/inventory.module';
const appRoutes=[{
  path :'',
  redirectTo:'login',
  pathMatch:'full'

}];
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    InventoryModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
