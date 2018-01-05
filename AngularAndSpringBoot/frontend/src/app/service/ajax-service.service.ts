import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { catchError } from 'rxjs/operators/catchError';

@Injectable()
export class AjaxServiceService {

  constructor(private http: HttpClient) { }

  /**
  * Handle Http operation that failed.
  * Let the app continue.
  * @param operation - name of the operation that failed
  * @param result - optional value to return as the observable result
  */
  private handleError<T>(operation = 'operation', result?) {
    return (error): Observable<T> => {

      //send the error to remote logging infrastructure
      console.log(error);

      //Let the app keep running by returing an empty result.
      return of(result as T);
    }
  }

  //get方法
  get(url: string, optionHeader?: { [header: string]: string }): Observable<Object> {
    let headers = new HttpHeaders();
    //set option header
    for (let header in optionHeader) {
      let value = optionHeader[header];
      headers.append(header, value);
    }
    return this.http.get(url, { headers }).pipe(
      catchError(this.handleError<any>("getting error"))
    );
  };

  //post
  post(url: string, optionHeader?: { [header: string]: string }): Observable<Object> {
    let headers = new HttpHeaders({
      'Content-Type': 'application/x-www-form-urlencoded'
    });
    //set option header
    for(let header in optionHeader){
      let value = optionHeader[header];
      headers.append(header,value);
    }
    return this.http.post(url, headers);
  }
}
