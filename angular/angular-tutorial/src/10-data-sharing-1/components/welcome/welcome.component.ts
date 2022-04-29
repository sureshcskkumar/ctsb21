import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {

  user:string = "";
  constructor() { 
    this.user = localStorage.getItem("uname")||"unknown";
  }

  ngOnInit(): void {
  }

}
