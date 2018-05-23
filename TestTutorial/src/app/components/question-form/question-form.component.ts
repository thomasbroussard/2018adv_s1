import {Question} from '../../datamodel/question';
import {Component, OnInit} from '@angular/core';


@Component({
  selector: 'app-question-form',
  templateUrl: './question-form.component.html',
  styleUrls: ['./question-form.component.css']
})
export class QuestionFormComponent implements OnInit {
  question: Question;

  constructor() {}

  ngOnInit() {
    this.question = new Question(0, 'test', 1, ['']);
  }

}
