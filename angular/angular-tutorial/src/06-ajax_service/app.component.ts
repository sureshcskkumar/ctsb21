import { Component } from "@angular/core";
import { Address, User } from "./models/user.model";
import { UserService } from "./services/user.service";


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


    removeUser(id:number){
        console.log("Remove user with id: "+id);
        this.userService.removeUser(id).subscribe({
            next: ()=>{
                this.getAllUsers();
            }
        })
    }
    createNewUser(){
        console.log("Creating new User");

        let user = new User(9999, "9999", "9999@gmail.com", new Address("9999", "9999", "9999"), new Date());

        this.userService.saveUser(user).subscribe({
            next:(res:any)=>{
                console.log("++++++++++++++++++++")
                console.log("++++++++++++++++++++")
                console.log("++++++++++++++++++++")
                console.log("++++++++++++++++++++")
                console.log("++++++++++++++++++++")
                console.log(res);
                this.getAllUsers();
            }
        })

    }
}
