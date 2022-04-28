import { Component } from "@angular/core";
import { UserService } from "./services/user.service";

class Address{

    constructor(
        public street:number,
        public city:string,
        public zipcode:string
        ){}
        
    }
    
    class User{
        constructor(
            public id:number,
            public username:string,
            public email:string,
            public address:Address,
            public dob:Date 
            ){}
}

@Component({
    selector: "app-root",
    templateUrl: `app.component.html`,
    styleUrls: ["app.component.scss"],
    providers: []
})
export class AppComponent {
    // user:User[] = [];
    users:Array<User> = [];

    constructor(private userService:UserService){
        this.getAllUsers();
    }

    getAllUsers(){
        this.userService.fetchAllUsers().subscribe({
            next: (res:any)=>{
                console.log("Response from database:")
                console.log(res);

                this.users = res;

                res.forEach((user:User)=>{
                    user.dob = new Date("2017-06-15")
                })

                console.log(this.users)

            }
        })
    }
}
