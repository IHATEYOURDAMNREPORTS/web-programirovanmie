import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { Study } from './study';

@Injectable({
  providedIn: 'root'
})
export class StudiesService {

  constructor(
    private http: HttpClient,
  ) { }
  
  private api_token = '3012aafc-e72f-4b5a-9da7-bf5454aef49e';
  private baseURL = 'https://www.movebank.org/movebank/service';
  private studiesUrl = `${this.baseURL}/public/json?entity_type=study&i_can_see_data=true&api-token=${this.api_token}`;  // URL to web api
  /** GET heroes from the server */
  getStudies(): Observable<Study[]> {
    return this.http.get<Study[]>(this.studiesUrl);
  }
  /** GET Study by id. Will 404 if id not found */
  getStudy(id: number): Observable<Study> {
    const studyURL = `${this.baseURL}/public/json?study_id=${id}&entity_type=study&api-token=${this.api_token}`;
    return this.http.get<Study>(studyURL);
  }
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }


}
