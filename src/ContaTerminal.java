public class ContaTerminal {
    int Numero;
    String NomeAgencia;
    String Nome;
    int Saldo;

    public void pagamento(int valorPago) {
        this.Saldo = this.Saldo - valorPago;
    }

}
