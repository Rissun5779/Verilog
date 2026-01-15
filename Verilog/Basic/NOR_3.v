`include "OR_3.v"

module NOR_3(
    input wire A,
    input wire B,
    input wire C,
    output wire Y
  );

  wire OR_Res;

  OR_3 U1 (
         .A(A),
         .B(B),
         .C(C),
         .Y(OR_Res)
       );

  assign Y = ~OR_Res;
endmodule
