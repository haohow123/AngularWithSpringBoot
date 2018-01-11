import { Injectable } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

@Injectable()
export class RouterService {
  public static getComponents(routes: Routes): any[] {
    let result = this.findComponents(routes).filter((value, index, self) => {
      console.error(value);
      console.error(index);
      console.error(self);
      return self.indexOf(value) === index;
    });
    return result;
  }

  public static findComponents(routes: Routes): any[] {
    let arr: any[] = [];
    routes.forEach(
      item => {
        if (item.component != null) {
          console.warn(item);
          arr.push(item.component);
        }
        if (item.children != null) {
          this.findComponents(item.children).forEach(
            com => {
              console.log(com);
              arr.push(com);
            }
          );
        }
      });
    arr.filter((value, index, self) => {
      console.error(value);
      console.error(index);
      console.error(self);
      return self.indexOf(value) === index;
    });
    return arr;
  }

  constructor() { }

}
