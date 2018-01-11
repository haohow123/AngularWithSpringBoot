import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; //<-- ngModel lives here
import { HttpClientModule } from '@angular/common/http';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { AppRoutingModule } from './/app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CommonModule } from '@angular/common';

import { AppComponent } from './app.component';
import { MemberComponent } from './member/member.component';
import { CrmComponent } from './crm/crm.component';
import { WorkingTableComponent } from './crm/working-table/working-table.component';

import { HeroService } from './tour-of-heroes/heros/service/hero.service';
import { MessageService } from './tour-of-heroes/messages/service/message.service';
import { InMemoryDataService } from './in-memory-data.service';
import { AjaxServiceService } from './/service/ajax-service.service';
import { RouterService } from './service/router.service';

import { TourOfHeroesModule } from './tour-of-heroes/tour-of-heroes.module';




@NgModule({
  declarations: [
    AppComponent,
    MemberComponent,
    CrmComponent,
    WorkingTableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    NgbModule.forRoot(),
    TourOfHeroesModule,
    CommonModule,
    HttpClientModule,

    // The HttpClientInMemoryWebApiModule module intercepts HTTP requests
    // and returns simulated server responses.
    // Remove it when a real server is ready to receive requests.
    // HttpClientInMemoryWebApiModule.forRoot(
    //   InMemoryDataService, { dataEncapsulation: false }
    // )
  ],
  providers: [HeroService, MessageService, InMemoryDataService, AjaxServiceService, RouterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
