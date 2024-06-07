package banco;
import java.util.Scanner;
import java.util.Scanner;
import banco.clientes.Deposito;
import banco.clientes.pagos;
import banco.clientes.retiro;
import banco.clientes.transferencias;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos del cliente
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese su cédula (10 dígitos):");
        long cedula = scanner.nextLong();
        if (String.valueOf(cedula).length() != 10) {
            System.out.println("Error: El número de cédula debe tener 10 dígitos.");
            return;
        }

        System.out.println("Ingrese su contraseña:");
        int contrasenia = scanner.nextInt();

        // Simulamos un número de cuenta
        long numeroCuenta = (long) (Math.random() * 10000000000L);
        // Crear cliente con un monto inicial de 5000


        // Crear cliente
        Clientes cliente = new Clientes(nombre, usuario, (int) cedula, contrasenia);
        cliente.setCuenta(cliente.cuenta);
        cliente.setMontou(5000);

        // Menú de transacciones
        System.out.println("\nBienvenido, " + cliente.getNombre() + "!");
        System.out.println("Número de cuenta: " + cliente.getCuenta());
        System.out.println("Seleccione una opción:");
        System.out.println("1. Realizar transferencia");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Pagar servicios");
        System.out.println("4. Realizar retiro");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Transferencia
                System.out.println("Ingrese el monto a transferir:");
                double montoTransferencia = scanner.nextDouble();
                System.out.println("Ingrese el número de cuenta destino:");
                long cuentaDestino = scanner.nextLong();
                /*if (String.valueOf(cuentaDestino).length() != 10) {
                    System.out.println("Error: El número de cuenta destino debe tener 10 dígitos.");
                    return;
                }*/
                transferencias transferencia = new transferencias(cliente.getNombre(), cliente.getUsuario(), cliente.getCedula(), cliente.getContrasenia(), montoTransferencia, Math.toIntExact(cuentaDestino));
                transferencia.mostrar();
                cliente.setMontou(cliente.getMontou() - montoTransferencia);
                break;

            case 2:
                // Depósito
                System.out.println("Seleccione una opción:");
                System.out.println("1. Depositar en su propia cuenta");
                System.out.println("2. Depositar en otra cuenta");
                int opcionDeposito = scanner.nextInt();

                switch (opcionDeposito) {
                    case 1:
                        // Depositar en su propia cuenta
                        System.out.println("Ingrese el monto a depositar:");
                        double montoDepositoPropio = scanner.nextDouble();
                        cliente.setMontou(cliente.getMontou() + montoDepositoPropio);
                        System.out.println("Depósito realizado correctamente en su propia cuenta.");
                        cliente.mostrar();
                        break;
                    case 2:
                        // Depositar en otra cuenta
                        System.out.println("Ingrese el monto a depositar:");
                        double montoDepositoOtraCuenta = scanner.nextDouble();
                        System.out.println("Ingrese el número de cuenta destino:");
                        int cuentaDeposito = scanner.nextInt();
                        Deposito deposito = new Deposito(cliente.getNombre(), cliente.getUsuario(), cliente.getCedula(), cliente.getContrasenia(), montoDepositoOtraCuenta, cuentaDeposito);
                        deposito.mostrar();
                        System.out.println("Depósito realizado correctamente en la cuenta destino.");
                        cliente.setMontou(cliente.getMontou() - montoDepositoOtraCuenta);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }


            case 3:
                // Pagar servicios
                System.out.println("Seleccione el tipo de pago:");
                System.out.println("1. Pago de servicios básicos");
                System.out.println("2. Pago de tarjeta");
                int tipoPago = scanner.nextInt();
                if (tipoPago == 1) {
                    // Pago de servicios básicos
                    System.out.println("Ingrese el monto a pagar por servicios:");
                    double montoServicios = scanner.nextDouble();
                    if (cliente.getMontou() >= montoServicios) {
                        cliente.setMontou(cliente.getMontou() - montoServicios);
                        System.out.println("Pago realizado correctamente.");
                        cliente.mostrar();
                    } else {
                        System.out.println("Saldo insuficiente para realizar el pago.");
                    }
                } else if (tipoPago == 2) {
                    // Pago de tarjeta
                    System.out.println("Ingrese el monto a pagar por la tarjeta:");
                    double montoTarjeta = scanner.nextDouble();
                    if (cliente.getMontou() >= montoTarjeta) {
                        cliente.setMontou(cliente.getMontou() - montoTarjeta);
                        System.out.println("Pago realizado correctamente.");
                        cliente.mostrar();
                    } else {
                        System.out.println("Saldo insuficiente para realizar el pago.");
                    }
                } else {
                    System.out.println("Opción no válida.");
                }
                break;
            case 4:
                // Retiro
                System.out.println("Ingrese el monto a retirar:");
                int montoRetiro = scanner.nextInt();
                retiro retiro = new retiro(cliente.getNombre(), cliente.getUsuario(), cliente.getCedula(), cliente.getContrasenia(), montoRetiro);
                retiro.mostrar();
                cliente.setMontou(cliente.getMontou() - montoRetiro);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
