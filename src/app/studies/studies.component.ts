import { Component, OnInit } from '@angular/core';
import { Study } from '../study';
import { StudiesService } from '../studies.service';


@Component({
  selector: 'app-studies',
  templateUrl: './studies.component.html',
  styleUrl: './studies.component.css'
})

export class StudiesComponent implements OnInit {
  studies: Study[] = [];

  constructor(private studiesService: StudiesService) { }
  
  ngOnInit(): void {
    this.getStudies();
  }

  getStudies(): void {
    this.studiesService.getStudies()
        .subscribe(studies => this.studies = studies);
  }
}