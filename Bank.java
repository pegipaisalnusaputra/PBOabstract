package emoney;

public interface Bank {
    String getNomeAccount ();
    void transfer (int amount, String accountNumber);
}
