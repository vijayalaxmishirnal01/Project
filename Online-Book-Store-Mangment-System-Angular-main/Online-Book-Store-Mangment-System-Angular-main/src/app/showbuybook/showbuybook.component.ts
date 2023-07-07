import { Component, Injectable, OnInit } from '@angular/core';
import { BuybookService } from '../service/buybook.service';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})

@Component({
  selector: 'app-showbuybook',
  templateUrl: './showbuybook.component.html',
  styleUrls: ['./showbuybook.component.css']
})
export class ShowbuybookComponent implements OnInit {
  bbook!: any;
  que: any;
  constructor(private b: BuybookService, private r: Router) { }


  show() {
    this.b.getAllBuyBook().subscribe(res => {
      this.bbook = res;
    }, e => {
      alert("error");
    })
  }

  deleteBBook(b: any) {
    if (confirm("You Want to Delete Buyed Book")) {
      this.b.deleteBuyBook(b).subscribe(res => {
        this.show();
      }, e => {
        alert("error");
        this.show();
      });
    } else {
      this.show();
    }
  }

  ngOnInit(): void {
    this.show();
  }
}
