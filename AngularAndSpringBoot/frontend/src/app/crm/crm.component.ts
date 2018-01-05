import { Component, OnInit, ViewChild } from '@angular/core';
import { AjaxServiceService } from '..//service/ajax-service.service';

@Component({
  selector: 'app-crm',
  templateUrl: './crm.component.html',
  styleUrls: ['./crm.component.css']
})
export class CrmComponent implements OnInit {
  @ViewChild('workTable') workTable;

  height: number = 100;

  getHeight(): void {
    console.log('i do');
    this.height = this.workTable.nativeElement.offsetHeight - 95;
    console.log(this.height);
    this.ajaxService.get('/Member/getAllMember').subscribe(
      res=>console.log(res)
    );
  }

  constructor(private ajaxService: AjaxServiceService) { }

  ngOnInit() {
    this.getHeight();
  }

}
