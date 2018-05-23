import {Routes, RouterModule} from '@angular/router';

import {AppComponent} from './app.component';
import {LoginComponent} from './components/login/login.component';
import { McQuestionsComponent } from './components/mc-questions/mc-questions.component';
import {QuestionsListComponent} from './components/questions-list/questions-list.component';
import {Question} from './datamodel/question';

const appRoutes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'questions', component: QuestionsListComponent},
  {path: 'questions/mcq/:id', component: McQuestionsComponent}


];


export const router = RouterModule.forRoot(appRoutes);
