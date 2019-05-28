
package Quest1;

public class Teste {
    public static void main(String[]args){
        Pessoa p1=new Pessoa("Anselmo","Rua: Camilo - 1006","(38)3741-2445");
        Fornecedor f1=new Fornecedor("Eletrocom","Rua Pio XII - 606","(38)988078969",2000,00);
        Empregado e1=new Empregado("Anselmo","Rua Camilo","1006",2000,500,101);
        
        System.out.println(f1.obterSaldo());
        System.out.println(e1.calcularSalario());
    }
}
