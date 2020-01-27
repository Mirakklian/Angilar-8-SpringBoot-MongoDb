import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ReviewComponent } from './review/review.component';
import { DetailComponent } from './detail/detail.component';
import { HospitalService } from './hospital.service';
import {HttpClientModule} from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    ReviewComponent,
    DetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [HospitalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
