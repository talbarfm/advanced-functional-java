package exercises.main.java.com.bobocode.fp.function;

import exercises.main.java.com.bobocode.fp.utils.model.Account;

@FunctionalInterface
public interface AccountService {
    void processAccount(Account account);

    default void processWithNoAccount(){
        /* No operation */
    }
}
