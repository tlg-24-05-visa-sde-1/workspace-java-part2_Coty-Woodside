/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * European orders are taxed as follows:
 * VAT is 17% of taxable amount.
 * Luxury tax is an additional 25% on amount over $100.
 * <p>
 * TODO: implement this algorithm.
 */
public class EuropeTax implements TaxCalculator{
    private static final double VAT_RATE = 0.17;
    private static final double LUX_RATE = 0.25;
    private static final double LUX_FREE_AMOUNT = 100;

    public double taxAmount(double taxable) {
        double vat = taxable * VAT_RATE;
        double luxury = 0.0;

        if (taxable > LUX_FREE_AMOUNT) {
            luxury = (taxable - LUX_FREE_AMOUNT) * LUX_RATE;
        }
        return vat + luxury;
    }
}