package tax;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    final static double PROGRESSIVE_TAX_10 = 0.10;
    final static double PROGRESSIVE_TAX_15 = 0.15;
    final static int AMOUNT_LIMIT = 100000;


    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        int i = amount.intValue();
        double chek;

        if (i < AMOUNT_LIMIT){
            chek = PROGRESSIVE_TAX_10;
            } else {
            chek = PROGRESSIVE_TAX_15;
        }
            return new BigDecimal(chek).multiply((amount));

        }
    }


//Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15% (ProgressiveTaxType)
//   return new BigDecimal(PROGRESSIVE_TAX_10).multiply(amount);
//           } else {
//           return new BigDecimal(PROGRESSIVE_TAX_15).multiply(amount);
//
//           }