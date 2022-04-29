import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {

  user:string = "";
  constructor(private activeatedRoute:ActivatedRoute) { 
    this.activeatedRoute.params.subscribe((params:any)=>{
      console.log(params);
      this.user = params["name"];
    })
  }

  ngOnInit(): void {
  }

}
