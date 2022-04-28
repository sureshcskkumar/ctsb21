import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginForm:FormGroup;

  constructor() { 
    this.loginForm = new FormGroup({
      uname: new FormControl("", [
        Validators.required,
        Validators.minLength(5)
      ]),
      pwd: new FormControl("")
    });
  }

  ngOnInit(): void {
  }

  getLogin(){
    console.log(this.loginForm)
    console.log(this.loginForm.value)

    // this.service.login(this.loginForm.value).subscribe(){}
  }

}
