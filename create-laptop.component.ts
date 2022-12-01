import { Component, OnInit } from '@angular/core';
import { Laptop } from '../Laptop';
import { LaptopService } from '../laptop.service';
import { Router } from '@angular/router';
import { BrandService } from '../brand.service';
import { ColdObservable } from 'rxjs/internal/testing/ColdObservable';


@Component({
  selector: 'app-create-laptop',
  templateUrl: './create-laptop.component.html',
  styleUrls: ['./create-laptop.component.css']
})
export class CreateLaptopComponent implements OnInit {
  laptop:Laptop=new Laptop();
  brandnames:string[];
  brandcode:number;
  constructor(private laptopService:LaptopService,private route:Router,private brandSer:BrandService) { }

  ngOnInit(): void {
    this.get();
  
  }
  get(){
   this.brandSer.getBrandName().subscribe(data=>{
    console.log(data);
    this.brandnames=data;
   });
  }
  onSelect(){
  this.brandSer.getBrandCode(this.laptop.brand).subscribe(data=>{
    this.laptop.brandCode=data;
    console.log(this.laptop.brandCode);
  })
}
  saveLaptop(){
    this.laptopService.addLap(this.laptop).subscribe(data=>{
      console.log(data);
      this.goToLaptopList();
    });
  }
  goToLaptopList(){
    this.route.navigate(['home/Laptop-List']);
  }
  onSubmit(){
    console.log(this.laptop);
    this.saveLaptop();
  }

}
