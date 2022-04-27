import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    // template: `<h1>This is my first angular component</h1>`,
    templateUrl: `app.component.html`,
    // styles: ["h1{text-align: center;}"]
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    constructor() {
        console.log("this is component");
    }
}
