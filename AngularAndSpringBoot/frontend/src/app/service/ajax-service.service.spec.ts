import { TestBed, inject } from '@angular/core/testing';

import { AjaxServiceService } from './ajax-service.service';

describe('AjaxServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AjaxServiceService]
    });
  });

  it('should be created', inject([AjaxServiceService], (service: AjaxServiceService) => {
    expect(service).toBeTruthy();
  }));
});
