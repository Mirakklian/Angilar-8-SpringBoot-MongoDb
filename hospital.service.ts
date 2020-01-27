import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Hospital } from './hospital';
import { Observable } from 'rxjs';
// import 'rxjs/add/operator/catch';
// import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  private url: string="http://localhost:8080/hospital";
  constructor(private http: HttpClient) { }

  getHospital() : Observable<Hospital[]>
  {
    return this.http.get<Hospital[]>(this.url);
    
                          //  .catch(this.errorHandler);
  }

  // errorHandler(error : HttpErrorResponse)
  // {
  //   return Observable.throw(error.message || 'Server Error');  
  // }
}
