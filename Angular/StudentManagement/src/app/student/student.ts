import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-student',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './student.html',
  styleUrl: './student.css'
})
export class Student {

  title = "Student Management System";

  msg = "Register Here";

  imageUrl =
    "https://angular.dev/assets/images/press-kit/angular_icon_gradient.gif";

  age = 10;

  num1 = 0;

  languages = [
    "C",
    "C++",
    "Java",
    "Javascript",
    "Angular"
  ];

  names = ["Sam"];

  uname = "";

  info() {
    alert("This is Function");
  }

}