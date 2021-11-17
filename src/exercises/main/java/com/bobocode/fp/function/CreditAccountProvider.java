package exercises.main.java.com.bobocode.fp.function;

import java.util.Optional;

import exercises.main.java.com.bobocode.fp.utils.model.CreditAccount;

@FunctionalInterface
public interface CreditAccountProvider {
    Optional<CreditAccount> getAccount();
}
