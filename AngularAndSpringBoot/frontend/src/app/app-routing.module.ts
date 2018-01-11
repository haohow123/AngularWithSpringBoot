import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TourOfHeroesModule } from './tour-of-heroes/tour-of-heroes.module';

import { CrmComponent } from './crm/crm.component';
import { TourOfHeroesComponent } from './tour-of-heroes/tour-of-heroes.component';

const routes: Routes = [
  { path: '', redirectTo: 'tourOfHero', pathMatch: "full" },
  { path: 'CRM', component: CrmComponent },
  {
    path: 'tourOfHero',
    component: TourOfHeroesComponent,
    loadChildren: () => TourOfHeroesModule
  },
  { path: '**', redirectTo: '/tourOfHero', pathMatch: 'full' }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
