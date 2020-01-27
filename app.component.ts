import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hospital Information';
  detail=false;
  review=false;

  showDetails()
  {
    
    this.detail=true;
  }
  showReview()
  {
    
    this.review=true;
  }
}
