module MUL4_1(
    input       [3:0] I,
    input       [1:0] S,
    output reg        F
);

    always @(*) begin
        F = I[S];
    end
endmodule 