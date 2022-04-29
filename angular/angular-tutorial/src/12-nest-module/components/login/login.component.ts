import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  getLogin(username:string){
    console.log(username+" is trying to get login");
    // go to welcome page
    this.router.navigate(["/", "welcome", username])
  }

}
