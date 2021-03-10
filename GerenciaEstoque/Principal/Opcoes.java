package Principal;

public class Opcoes {

    


    public boolean primeiraEscolha(int e) {
        switch (e) {
            case 0: 
                msostar( "Escolha a opção: \n" + 
                        "1- Produtos \n" + 
                        "2 - Notas Fiscais");
                int opcao = entrada.nextInt();
                primeiraEscolha(opcao);
                return true;
            case 1: 
                opcoesProdutos(0);
                return true;
            case 2:
                opcoesNotas(0);
                return true;
            default:
                return false;
        }
    }

    private void opcoesProdutos(int eProdutos) {
        switch (eProdutos) {
            case 0:
                mostar( "escolha a opcao \n" +
                        "1- CADASTRAR \n" +
                        "2- CONSULTAR \n" +
                        "3- ALTERAR \n" +
                        "4- EXCLUIR");
                int opcao = entrada.nextInt();
                opcoesProdutos(opcao);;
            break;                
            case 1:
                cadastrarProduto();
                break;
            case 2:
                consultarProduto();
                break;            
            case 3:
                alterarProduto();
                break;
            case 4:
                excluirProduto();
                break;
            default:
                break;
        }
    }

    private void opcoesNotas(int eNotas) {
        switch (eNotas) {
            case 0:
                mostar( "escolha a opcao \n" +
                        "1- CRIAR \n" +
                        "2- CONSULTAR \n" +
                        "3- ALTERAR \n" +
                        "4- VER VALOR TOTAL DO DIA");
                int opcao = entrada.nextInt();
                opcoesNotas(opcao);;
                break;
            case 1:
                criarNota();
                break;
            case 2:
                consultarNota();
                break;            
            case 3:
                alterarNota();
                break;
            case 4:
                totalDoDia();
                break;
            default:
                break;
        }
    }
    
}
