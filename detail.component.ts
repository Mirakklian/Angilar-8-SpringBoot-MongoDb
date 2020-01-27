import { Component, OnInit } from '@angular/core';
import { HospitalService } from '../hospital.service';



@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  public reviews=[];

  constructor(private emp : HospitalService) { }

  ngOnInit() {
    this.emp.getHospital().subscribe(data => this.reviews = data);
    
  }
  

}
