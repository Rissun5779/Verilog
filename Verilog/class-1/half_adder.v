module half_adder(
    input X,
    input Y,
    output S,
    output C
);

    assign {C, S} = X+Y;
endmodule