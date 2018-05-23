import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';

import {AppComponent} from './app.component';
import { QuestionFormComponent } from './components/question-form/question-form.component';
import {QuestionlistComponent} from './components/questionlist/questionlist.component';
import {QuestionService} from './services/question.service';



@NgModule({
  declarations: [
    AppComponent,
    QuestionlistComponent,
    QuestionFormComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [
    QuestionService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
