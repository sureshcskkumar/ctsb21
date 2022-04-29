import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

const routes:Routes = [
  {path: "login", component: LoginComponent},
  {path: "welcome", component: WelcomeComponent}
];

@NgModule({
  declarations: [
    LoginComponent,
    WelcomeComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ]
})
export class UserModule { }
