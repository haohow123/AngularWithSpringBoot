import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; //<-- ngModel lives here
import { HttpClientModule } from '@angular/common/http';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { AppRoutingModule } from './/app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HerosComponent } from './tour-of-heroes/heros/heros.component';
import { MessagesComponent } from './tour-of-heroes/messages/messages.component';
import { HeroDetailComponent } from './tour-of-heroes/hero-detail/hero-detail.component';
import { DashboardComponent } from './tour-of-heroes/dashboard/dashboard.component';
import { TutorialLinkComponent } from './tour-of-heroes/tutorial-link/tutorial-link.component';
import { HeroSearchComponent } from './tour-of-heroes/hero-search/hero-search.component';
import { MemberComponent } from './member/member.component';
import { TourOfHeroesComponent } from './tour-of-heroes/tour-of-heroes.component';
import { CrmComponent } from './crm/crm.component';

import { HeroService } from './tour-of-heroes/heros/service/hero.service';
import { MessageService } from './tour-of-heroes/messages/service/message.service';
import { InMemoryDataService } from './in-memory-data.service';



@NgModule({
  declarations: [
    AppComponent,
    HerosComponent,
    HeroDetailComponent,
    MessagesComponent,
    DashboardComponent,
    HeroSearchComponent,
    TutorialLinkComponent,
    MemberComponent,
    TourOfHeroesComponent,
    CrmComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    NgbModule.forRoot(),
    HttpClientModule,

    // The HttpClientInMemoryWebApiModule module intercepts HTTP requests
    // and returns simulated server responses.
    // Remove it when a real server is ready to receive requests.
    // HttpClientInMemoryWebApiModule.forRoot(
    //   InMemoryDataService, { dataEncapsulation: false }
    // )
  ],
  providers: [HeroService, MessageService, InMemoryDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
