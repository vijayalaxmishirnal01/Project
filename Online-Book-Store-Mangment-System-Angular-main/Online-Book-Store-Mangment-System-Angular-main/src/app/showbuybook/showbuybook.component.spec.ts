import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowbuybookComponent } from './showbuybook.component';

describe('ShowbuybookComponent', () => {
  let component: ShowbuybookComponent;
  let fixture: ComponentFixture<ShowbuybookComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowbuybookComponent]
    });
    fixture = TestBed.createComponent(ShowbuybookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
