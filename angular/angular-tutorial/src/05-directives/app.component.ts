import { Component } from "@angular/core";

class Book{
    constructor(
        public id:number,
        public title:string,
        public author:string,
        public price:number
    ){}
}

@Component({
    selector: "app-root",
    templateUrl: `app.component.html`,
    styleUrls: ["app.component.scss"]
})
export class AppComponent {
    // books:Book[] = [];
    books:Array<Book> = [];

    constructor(){
        // fetch books from database ->
        // assume database is empty
        // this.books = [
        //     {id: 152, title: "Superman", author: "Mark", price: 68.1},
        //     new Book(241, "Batman", "Emily", 69.1)
        // ];

        // this.books.push(new Book(375, "Antman", "Harry", 105.2));
    }
}
