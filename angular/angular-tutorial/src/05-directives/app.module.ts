import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";


  
  @NgModule({
    declarations: [AppComponent], // components, directives, pipes
    imports: [BrowserModule], // other modules
    providers: [], // reusable classes -> services
    bootstrap: [AppComponent] // starting component
  })
 export class AppModule{}