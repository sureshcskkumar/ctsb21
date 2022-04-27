import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";


  
  @NgModule({
    declarations: [AppComponent], // components, directives, pipes
    imports: [BrowserModule, FormsModule], // other modules
    providers: [], // reusable classes -> services
    bootstrap: [AppComponent] // starting component
  })
 export class AppModule{}