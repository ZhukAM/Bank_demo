package bank_demo;

/**
 * Created by Aleksandr Zhuk on 15.01.17.
 */

class Bank<T extends Account> {
    T[] accounts;
    public Bank(T[] accs) {
        this.accounts = accs;
    }
    // вывод информации обо всех аккаунтах
    public void AccountsInfo() {
        for(IAccount acc : accounts) {
            System.out.println(acc.getId());
        }
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[] {new Account(1857), new Account(2225),
                new Account(33232)};
        Bank<Account> bank = new Bank(accounts);
        bank.AccountsInfo();
    }
}

    interface IAccount {
        int getId();
    }

    class Account implements IAccount {
        private int _id; // номер счета

        public int getId() {
            return _id;
        }

        Account(int id) {
            _id = id;
        }

    }


