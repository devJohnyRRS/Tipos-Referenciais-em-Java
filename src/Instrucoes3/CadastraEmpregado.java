package Instrucoes3;

public class CadastraEmpregado {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.setRazaoSocial("FATEC");
        empresa.setCnpj("12.345.678/0001-99");
        empresa.setFone("1234-5678");

        Empregado empregado = new Empregado();
        empregado.setNome("Johny Richard");
        empregado.setSalario(3500.00);
        empregado.setEmpresa(empresa);

        System.out.println("Informações do Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: R$" + empregado.getSalario());

        System.out.println("\nInformações da Empresa:");
        System.out.println("Razão Social: " + empregado.getEmpresa().getRazaoSocial());
        System.out.println("CNPJ: " + empregado.getEmpresa().getCnpj());
        System.out.println("Telefone: " + empregado.getEmpresa().getFone());

    }
}
