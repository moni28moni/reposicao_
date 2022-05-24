public class App {
    public static void main(String[] args) throws Exception {
        Membro membro1 = new Membro(" Mônica Macêdo ", " BP ", 3009904);
        

        Membro membro2 = new Membro(" Hacker super gato ", " BP ", 3009805);
        

        Membro membro3 = new Membro(" Percy Jackson ", " BP ", 3009706);
        

        Comissao comissaoCEIC = new Comissao( "Portaria n° 5560 de 24 de Maio de 2022");
        comissaoCEIC.adicionaMembro(membro1);
        comissaoCEIC.adicionaMembro(membro2);
        comissaoCEIC.adicionaMembro(membro3);

        //comissaoCEIC.listaTodosOsMembros();
        Membro resultadoBusca = comissaoCEIC.pesquisarMembroPorNome("Mô");
        if(resultadoBusca != null){
            System.out.println(resultadoBusca);
        }else{
            System.out.println("Não foi encontrado nunhum resultado!");
        }
    }
}
