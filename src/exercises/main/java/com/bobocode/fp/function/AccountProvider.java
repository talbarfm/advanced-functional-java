package exercises.main.java.com.bobocode.fp.function;

import java.util.Optional;

import exercises.main.java.com.bobocode.fp.utils.model.Account;

@FunctionalInterface
public interface AccountProvider {
    Optional<Account> getAccount();
}
