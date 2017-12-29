import { Injectable } from '@angular/core';
import { Hero } from "../hero";
import { HEROES } from "../mock-heroes";
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { MessageService } from '../../messages/service/message.service'

@Injectable()
export class HeroService {

  getHeroes(): Observable<Hero[]> {
    // Todo: send the message _after_ fetching the heroes
    this.messageService.add('HeroService: fetched heroes');
    return of(HEROES);
  }

  getHero(id: number): Observable<Hero> {
    // Todo: send the message _after_ fetching the hero
    this.messageService.add('HeroService: fetched heroes');
    return of(HEROES.find(hero => hero.id === id));
  };
  constructor(private messageService: MessageService) { }
}