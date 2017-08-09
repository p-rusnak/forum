import {Component, OnInit} from "@angular/core"

import {Section} from './../section.model'
import {SectionService} from './../section.service'

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html'
})
export class MainComponent implements OnInit{

  sections: Section[] = []
  constructor(private sectionService: SectionService){}
  ngOnInit(){
    this.sectionService.getSections()
      .subscribe(
        (sections: any[]) => {
          this.sections = sections
        },
        (error) => console.log(error)
      );
  }
}
