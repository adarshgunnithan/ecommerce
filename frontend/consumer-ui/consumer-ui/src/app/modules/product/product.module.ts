import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListComponent } from './list/list.component';
import { ThumbnailComponent } from './thumbnail/thumbnail.component';
import { SearchComponent } from './search/search.component';

@NgModule({
  declarations: [ListComponent, ThumbnailComponent, SearchComponent],
  exports:[ListComponent,SearchComponent]
})
export class ProductModule { }
