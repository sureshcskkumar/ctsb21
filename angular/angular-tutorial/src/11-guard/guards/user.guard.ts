import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
// import jwt_decode from "jwt-decode";

@Injectable({
  providedIn: 'root'
})
export class UserGuard implements CanActivate {
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean {
      // logic to find if user is valid or invalid
      console.log("guards is working");
      /* 
      localStorage.getItem("token");
      var payload = jwt_decode(token);
                        payload -> {
                          "sub": "1234567890",
                          "name": "John Doe",
                          "iat": 1516239022
                        }
      */

    return false;
  }
  
}
