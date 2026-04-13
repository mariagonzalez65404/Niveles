class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + 
                           ", Cuenta: " + numeroCuenta + 
                           ", Saldo actual: " + saldo);
    }

    // Getters para acceder a los atributos si se necesitan
    public String getTitular() { return titular; }
    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }
}
