import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HerosComponent } from './tour-of-heroes/heros/heros.component';
import { DashboardComponent } from './tour-of-heroes/dashboard/dashboard.component'
import { HeroDetailComponent } from './tour-of-heroes/hero-detail/hero-detail.component';
import { TutorialLinkComponent } from './tour-of-heroes/tutorial-link/tutorial-link.component';
import { TourOfHeroesComponent } from './tour-of-heroes/tour-of-heroes.component';
import { CrmComponent } from './crm/crm.component';

const routes: Routes = [
  { path: 'CRM', component: CrmComponent },
  {
    path: 'tourOfHero',
    component: TourOfHeroesComponent,
    children: [
      { path: 'dashboard', component: DashboardComponent },
      { path: 'detail/:id', component: HeroDetailComponent },
      { path: 'heroes', component: HerosComponent },
      { path: 'turtorial', component: TutorialLinkComponent },
    ]
  },
  { path: '**', redirectTo: '/tourOfHero', pathMatch: 'full' }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
