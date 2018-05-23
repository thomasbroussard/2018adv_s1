import {Question} from '../../datamodel/question';
import {Component, OnInit} from '@angular/core';
import {Fo

@Component({
  selector: 'app-question-form',
  templateUrl: './question-form.component.html',
  styleUrls: ['./question-form.component.css']
})
export class QuestionFormComponent implements OnInit {
  question: Question;

  constructor() {}

  ngOnInit() {
  }

}
