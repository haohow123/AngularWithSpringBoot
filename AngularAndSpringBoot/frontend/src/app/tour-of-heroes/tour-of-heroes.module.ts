import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { TourOfHeroesRoutingModule } from './/tour-of-heroes-routing.module';

import { HerosComponent } from './heros/heros.component';
import { MessagesComponent } from './messages/messages.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { TutorialLinkComponent } from './tutorial-link/tutorial-link.component';
import { HeroSearchComponent } from './hero-search/hero-search.component';
import { TourOfHeroesComponent } from './tour-of-heroes.component';

import { RouterService } from '../service/router.service';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    TourOfHeroesRoutingModule
  ],
  declarations: [
    HerosComponent,
    HeroDetailComponent,
    MessagesComponent,
    DashboardComponent,
    HeroSearchComponent,
    TutorialLinkComponent,
    TourOfHeroesComponent
  ],
  bootstrap: [TourOfHeroesComponent]
})
export class TourOfHeroesModule { }
