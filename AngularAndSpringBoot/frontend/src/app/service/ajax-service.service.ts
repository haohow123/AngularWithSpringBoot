import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AjaxServiceService {

  constructor(private http: HttpClient) { }
  get(url: string, optionHeader?: { [header: string]: string }): Observable<Object> {
    let headers = new Headers();
    //set option header
    for (let header in optionHeader) {
      let value = optionHeader[header];
      headers.append(header, value);
    }
    return this.http.get(url);
  };
  private backendData(response: Response) {
    let result = response.json();
    return result || {};
  }
}
