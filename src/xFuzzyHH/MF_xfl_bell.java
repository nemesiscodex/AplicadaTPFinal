package xFuzzyHH;

//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  MF_xfl_bell                      //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//



public class MF_xfl_bell extends InputMembershipFunction {
 double a;
 double b;

 public MF_xfl_bell(double min, double max, double step, double single[], double list[]) {
  super.min = min;
  super.max = max;
  super.step = step;
  this.a = single[0];
  this.b = single[1];
 }
 public double param(int _i) {
  switch(_i) {
   case 0: return a;
   case 1: return b;
   default: return 0;
  }
 }

 public double isEqual(double x) {
    return Math.exp( -(a-x)*(a-x)/(b*b) ); 
 }
 public double isGreaterOrEqual(double x) {
    if(x>a) return 1; return Math.exp( - (x-a)*(x-a)/(b*b) ); 
 }
 public double isSmallerOrEqual(double x) {
    if(x<a) return 1; return Math.exp( - (x-a)*(x-a)/(b*b) ); 
 }
 public double center() {
    return a; 
 }
 public double basis() {
    return b; 
 }
}

