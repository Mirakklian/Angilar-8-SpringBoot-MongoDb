import { Component, OnInit } from '@angular/core';
import { HospitalService } from '../hospital.service';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  public reviews=[ ];

  constructor(private emp : HospitalService) { }

  ngOnInit() {
    this.emp.getHospital().subscribe(data => this.reviews = data);
  }

}
