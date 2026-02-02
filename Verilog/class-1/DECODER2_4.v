`define DECODER_1(A,B) (4'b1 << {A,B})
`define DECODER_2(A,B) ((~A&~B)?4'b0001:(~A&B) ?4'b0010:(A&~B) ?4'b0100:4'b1000)

module DECODER2_4(
    input        A,
    input        B,
    output [3:0] Y
);

    assign Y = `DECODER_2(A,B);
endmodule
