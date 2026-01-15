`include "AND_2.v"

module NAND_2(
    input wire A,
    input wire B,
    output wire Y
  );

  wire AND_Res;

  AND_2 U1 (
          .A(A),
          .B(B),
          .Y(AND_Res)
        );

  assign Y = ~AND_Res;
endmodule
