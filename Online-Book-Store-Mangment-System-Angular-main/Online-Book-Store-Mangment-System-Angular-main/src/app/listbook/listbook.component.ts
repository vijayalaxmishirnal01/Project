import { Component, Injectable, OnInit } from '@angular/core';
import { BookserviceService } from '../service/bookservice.service';
import { AppComponent } from '../app.component';
import { Router } from '@angular/router';
import { BuybookService } from '../service/buybook.service';


@Injectable({
  providedIn: 'root'
})

@Component({
  selector: 'app-listbook',
  templateUrl: './listbook.component.html',
  styleUrls: ['./listbook.component.css']
})
export class ListbookComponent implements OnInit {

  title = "List Of Book";
  b: any;
  f!: boolean;
  f1: any;
  constructor(private book: BookserviceService, private app: AppComponent, private r: Router, private bb: BuybookService,
    private s: BuybookService) {
  }

  ngOnInit(): void {

    this.f1 = this.app.admin;
    this.book.getAllBook().subscribe(data => {
      this.b = data
    });
  }
  buy(obj: any) {
    if (this.app.normal == false) {
      alert("User Not Login !!")
      this.r.navigate(['/login']);
    } else {
      if (confirm("Book Name:" + obj.bname + "\nAuthor Name:" + obj.aname + "\n Total Amount:" + obj.price)) {
        alert("Payment page")
        this.s.addbuybook(obj).subscribe(res => {
        }, e => alert("error"));
      } else {

      }
    }
  }

}
