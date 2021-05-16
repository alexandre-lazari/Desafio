package Parte1;

import javax.swing.JOptionPane;

public class calculadora  {
    
/*

- a cada 100 pessoas que visualizam o anúncio 12 clicam nele.
- a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
- cada compartilhamento nas redes sociais gera 40 novas visualizações.
- 30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.
* o mesmo anúncio é compartilhado no máximo 4 vezes em sequência.

166,6666667 visualizações > 20          clicam > 3 compartilhamentos > 120 novas visualizações
222,2222223 visualizações > 26,66666667 clicam > 4 compartilhamentos > 160 novas visualizações *
382,2222223 visualizações > R$ 12,74074074
         30 visualizações > R$ 01,00

** receba o valor investido em reais
será digitado pelo usuário
VI=QV*(12,74074074)/(382,2222223)

** quantidade máxima de pessoas que visualizarão o mesmo anúncio
resultado que será retornado pelo sistema
QV=VI*(382,2222223)/(12,74074074)
    
*/
    
    public static void main(String[] args) {
        
        int vi = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor investido em reais"));
        double qv = Math.round((vi * 382.22) / 12.74);
        JOptionPane.showMessageDialog(null, "A quantidade máxima de pessoas que visualizarão o anúncio é "+qv);
                        
    }
    
 /*

- massa utilizada para efetuar os testes unitários:
Valor Investido	 []  Quantidade Máxima de Visualização
12	       	 []  360,0188383
121	       	 []  3630,189953
33	       	 []  990,0518053
44	       	 []  1320,069074
1234	       	 []  37021,93721
    
*/   
    
}