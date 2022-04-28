export class Address{

    constructor(
        public street:string,
        public city:string,
        public zipcode:string
        ){}
        
    }
    
export class User{
        constructor(
            public id:number,
            public username:string,
            public email:string,
            public address:Address,
            public dob:Date 
            ){}
}
