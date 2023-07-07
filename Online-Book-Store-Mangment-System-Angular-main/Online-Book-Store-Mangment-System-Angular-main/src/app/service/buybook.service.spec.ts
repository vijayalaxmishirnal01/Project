import { TestBed } from '@angular/core/testing';

import { BuybookService } from './buybook.service';

describe('BuybookService', () => {
  let service: BuybookService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BuybookService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
