import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { User } from "../models/user.model";

@Injectable({providedIn: "root"})
export class UserService{

    private host:string = "https://jsonplaceholder.typicode.com/users/";

    constructor(private httpClient:HttpClient){}

    fetchAllUsers(){
        return this.httpClient.get(this.host, {headers: {}});
    }
    fetchUserById(){}
    saveUser(user:User){
        return this.httpClient.post(this.host, user, {headers: {}});
    }
    removeUser(id:number){
        return this.httpClient.delete(this.host+id);
    }
    updateUser(id:number, user:User){
        return this.httpClient.put(this.host+id, user, {headers: {"Authorization": "Bearer "+localStorage.getItem("token")}});
    }
}