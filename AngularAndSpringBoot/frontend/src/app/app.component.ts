import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app_TEST';
  isActive(pathname): boolean{
    return window.location.pathname.indexOf(pathname) != -1;
  }
}
