import { Component, OnInit } from '@angular/core';
import { Hero } from '../heros/hero';
import { HeroService } from '../heros/service/hero.service'
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  heroes: Hero[] = [];
  constructor(private heroService: HeroService,private http: HttpClient) { }

toBackend(){
    console.log('go');
    console.log(this.http);
    this.http.get('Member/getAllMember').subscribe(
      function(res: Response){
        console.log(res)
      }
    );
  }

  ngOnInit() {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService.getHeroes().subscribe(heroes => this.heroes = heroes.slice(1, 5));
  }

}
