import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Studentapp } from './studentapp';

describe('Studentapp', () => {
  let component: Studentapp;
  let fixture: ComponentFixture<Studentapp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Studentapp],
    }).compileComponents();

    fixture = TestBed.createComponent(Studentapp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
