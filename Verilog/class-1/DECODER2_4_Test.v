`timescale 1ns/10ps
module DECODER2_4_Test;

  // Parameters

  //Ports
  reg A;
  reg B;
  wire [3:0] Y;

  DECODER2_4  DECODER2_4_inst (
    .A(A),
    .B(B),
    .Y(Y)
  );
  
  initial begin
    $display("Time\t A B | Y");
    $display("------------------");

    A=0;B=0; #10 $display("%0t\t%b %b | %b", $time, A, B, Y);
    A=1;B=0; #10 $display("%0t\t%b %b | %b", $time, A, B, Y);
    A=0;B=1; #10 $display("%0t\t%b %b | %b", $time, A, B, Y);
    A=1;B=1; #10 $display("%0t\t%b %b | %b", $time, A, B, Y);
  end

endmodule