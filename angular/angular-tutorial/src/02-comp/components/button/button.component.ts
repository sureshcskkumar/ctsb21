import { Component } from "@angular/core";

@Component({
    selector: "app-button",
    templateUrl: `button.component.html`,
    styleUrls: ["button.component.scss"]
})
export class ButtonComponent {
    constructor() {
        console.log("this is button component");
    }
}
