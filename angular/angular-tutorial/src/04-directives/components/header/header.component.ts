import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  isValid:boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  doToggle(){
    this.isValid = !this.isValid;
  }

}
