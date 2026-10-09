package org.application;

import org.application.dto.EnderecoDto;
import org.application.service.ApiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ApiServico apiServico = new ApiServico();

        try{
            EnderecoDto enderecoDto = apiServico.getEndereco("38740596");
            System.out.println(enderecoDto.toString());
        } catch(IOException e){
            throw  new RuntimeException(e);
        } catch(InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}