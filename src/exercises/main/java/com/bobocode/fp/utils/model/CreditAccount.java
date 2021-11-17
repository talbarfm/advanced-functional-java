package exercises.main.java.com.bobocode.fp.utils.model;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Setter
public class CreditAccount extends Account {
    private BigDecimal creditBalance;

    public Optional<BigDecimal> getCreditBalance() {
        return Optional.ofNullable(creditBalance);
    }
    
    public static void Main(String[] args) {
        Account account = new Account();       
    }
}
