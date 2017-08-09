import { Http, Response} from  '@angular/http';
import "rxjs/Rx";
import {Injectable} from "@angular/core";

@Injectable()
export class SectionService{

  constructor(private http: Http) {}

  getSections(){
    return this.http.get('/api/section/all')
      .map(
        (response: Response) => {
          return response.json();
        }
      );
  }


}
