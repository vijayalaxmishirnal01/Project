import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { AuthService } from './auth.service';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class BuybookService {
  private url = "http://localhost:8080/user/";
  constructor(private ht: HttpClient,
    private aut: AuthService) {
  }

  addbuybook(buybook: any): Observable<any> {
    const headers = this.aut.getHeader();
    return this.ht.post(this.url + "buyBook", buybook, { headers: headers });
  }

  getAllBuyBook(): Observable<any> {
    const headers = this.aut.getHeader();
    return this.ht.get<any>(this.url + "getAllBuyBook", { headers: headers });
  }

  deleteBuyBook(buybook: any): Observable<any> {
    const headers = this.aut.getHeader();
    return this.ht.delete<any>(this.url + "deleteBuyBook", { headers: headers, body: buybook },);
  }
}
