import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OutItemsComponent } from './out-items.component';

describe('OutItemsComponent', () => {
  let component: OutItemsComponent;
  let fixture: ComponentFixture<OutItemsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OutItemsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OutItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
