package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyPad  = new Scanner(System.in);
        float cost, shipping = 0.0f, custo;
        int distributionCenter;
        System.out.println("Informe o número do CD (1, 2, 3): ");
        distributionCenter = keyPad.nextInt();// preco de venda = preco de custo + porcentagem do valor do frete custo
        while (distributionCenter > 0 && distributionCenter < 4){
            System.out.println("Informe o Valor de Custo: ");
            cost = keyPad.nextFloat();
            if (distributionCenter == 1){
                shipping = cost*1.07f;
            }else if (distributionCenter == 2){
                shipping = cost*1.15f;
            }else if (distributionCenter == 3){
                shipping = cost*1.22f;
            }
            custo = shipping*1.25f;
            System.out.println("O Preço de venda é R$ "+ custo);
            System.out.println("Sistema finalizado");



        }

    }


}
