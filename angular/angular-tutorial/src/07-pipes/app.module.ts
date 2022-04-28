import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { HttpClientModule } from "@angular/common/http";
// import { UserService } from "./services/user.service";


  @NgModule({
    declarations: [AppComponent], // components, directives, pipes
    imports: [BrowserModule, HttpClientModule], // other modules
    // providers: [UserService], // reusable classes -> services
    bootstrap: [AppComponent] // starting component
  })
 export class AppModule{}