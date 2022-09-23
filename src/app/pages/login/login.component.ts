import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm = new FormGroup({
    userEmail: new FormControl('', [Validators.required, Validators.email]),
    userPass: new FormControl('', [Validators.required]),
  });
  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  loginProcess(){
    if(this.loginForm.get('userEmail')?.value!=''){
      this.router.navigate(['/new-item']); //Redirect to Dashboard
    }
    else{
      alert("Username or password is Incorrect");   
     }
  }
  getUsername(){
    return this.loginForm.get('userEmail')?.value;
  }

}
