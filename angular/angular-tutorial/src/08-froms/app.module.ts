import { NgModule } from "@angular/core";
import { ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { LoginComponent } from './components/login/login.component';


  
  @NgModule({
    declarations: [AppComponent, LoginComponent], // components, directives, pipes
    imports: [BrowserModule, ReactiveFormsModule], // other modules
    providers: [], // reusable classes -> services
    bootstrap: [AppComponent] // starting component
  })
 export class AppModule{}