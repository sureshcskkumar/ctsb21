import { Component, Input, OnChanges, SimpleChanges } from "@angular/core";

@Component({
    selector: "app-button",
    templateUrl: `button.component.html`,
    styleUrls: ["button.component.scss"]
})
export class ButtonComponent implements OnChanges {
    @Input()
    color:string = "black";
    num:number = 5;
    myCss={
        "color": this.color
    };
    constructor() {
        console.log("this is button component: "+this.color);
    }

    ngOnChanges(changes: SimpleChanges): void {
        console.log("Color: "+this.color);
        console.log(changes);
        this.myCss.color = this.color;
    }
    
}
