import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: `app.component.html`,
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    name:string = "maulik";

    updateName(n:string){
        this.name = n;
    }

    doTask(){
        console.log("method called")
    }
}
