/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author momog
 */
public class LerFicheiros { 
    /**
     * Instancia todos os objetos a partir de ficheiros de texto
     * @return empresa
     * @throws FileNotFoundException 
     */
    public static Empresa adicionarInfo() throws FileNotFoundException {
        Empresa emp = new Empresa();        
        categorias(emp.getRegistoCategorias());
        Servicos(emp.getRegistoCategorias(), emp.getRegistoServicos());
        Clientes(emp.getRegistoClientes());
        EnderecoPostal(emp.getRegistoClientes());
        AreasGeograficas(emp.getRegistoAreasGeograficas());
        PrestadorServico(emp.getRegistoPrestadorServico(), emp.getRegistoCategorias());
        Administrativo(emp.getRegistoAdministrativo());        
        return emp;
    }
    
    /**
     * Instancia todas as categorias a partir de ficheiros de texto
     * @param rcat registo das categorias
     */
    public static void categorias(RegistoCategorias rcat) {
        try (Scanner fInput = new Scanner(new File("Categorias.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.trim().split(";");
                    rcat.addCategoria(new Categoria(Integer.parseInt(temp[0]), temp[1]));
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar as categorias.");
        }
        }
    /**
     * Instancia todos os serviços a partir de ficheiros de texto
     * @param rcat registo das categorias
     * @param rs registo dos serviços
     */
    @SuppressWarnings("empty-statement")
    public static void Servicos(RegistoCategorias rcat, RegistoServicos rs) {
        try (Scanner fInput = new Scanner(new File("Servicos.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.trim().split(";");
                    if(temp[5].equalsIgnoreCase("F")) {
                        ServicoFixo serv = new ServicoFixo(Integer.parseInt(temp[0]), temp[2], temp[3], Double.parseDouble(temp[4]), Integer.parseInt(temp[6]));
                        rcat.getCategoriaByID(Integer.parseInt(temp[1])).addServico(serv);
                        rs.addServico(serv);                       
                    }
                    if(temp[5].equalsIgnoreCase("L")) {
                        ServicoLimitado serv = new ServicoLimitado(Integer.parseInt(temp[0]), temp[2], temp[3], Double.parseDouble(temp[4]));
                        rcat.getCategoriaByID(Integer.parseInt(temp[1])).addServico(serv);
                        rs.addServico(serv);
                    }
                    if(temp[5].equalsIgnoreCase("E")) {
                        ServicoExpansivel serv = new ServicoExpansivel(Integer.parseInt(temp[0]), temp[2], temp[3], Double.parseDouble(temp[4]));
                        rcat.getCategoriaByID(Integer.parseInt(temp[1])).addServico(serv);
                        rs.addServico(serv);
                    }
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar os Serviços.");
        }
        }
    /**
     * Instancia todos os clientes a partir de ficheiros de texto
     * @param rc registo clientes
     */
    public static void Clientes(RegistoClientes rc) {
        try (Scanner fInput = new Scanner(new File("Clientes.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.split(";");
                    rc.addCliente(new Cliente(temp[0],Integer.parseInt(temp[1]),temp[2]));                    
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar os Clientes.");
        }
        }
    /**
     * Instancia todos os endereços de postal a partir de ficheiros de texto
     * @param rc 
     */
    public static void EnderecoPostal(RegistoClientes rc) {
        try (Scanner fInput = new Scanner(new File("EnderecoPostal.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.split(";");
                    rc.getClienteByEmail(temp[4]).addEndereco(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));                    
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar os endereços postais.");
        }
        }
    /**
     * Instancia todas as areas geograficas
     * @param rag registo areas geograficas
     */
    public static void AreasGeograficas(RegistoAreasGeograficas rag) {
        try (Scanner fInput = new Scanner(new File("AreasGeograficas.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.split(";");
                    rag.addAreaGeografica(new AreaGeografica(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar as Áreas Geográficas.");
        }
        }
    /**
     * Instancia todos os prestadores de serviço
     * @param rps registo prestadores de serviço
     * @param rc  registo categorias
     */
     public static void PrestadorServico(RegistoPrestadorServico rps, RegistoCategorias rc) {
        try (Scanner fInput = new Scanner(new File("PrestadorDeServico.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.split(";");
                    rps.addPrestadorServico(new PrestadorServico(Integer.parseInt(temp[0]),temp[1],temp[2],temp[3]));
                    rps.getPrestadorServicoByEmail(temp[3]).adicionarCategoria(rc.getCategoriaByID(Integer.parseInt(temp[4])));
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar os Prestadores de Serviço.");
        }
        }
     /**
      * Instancia todos os administrativos
      * @param ra registo administrativo
      */
     public static void Administrativo(RegistoAdministrativo ra) {
        try (Scanner fInput = new Scanner(new File("Administrativo.txt"))) {
            String linha;
            while (fInput.hasNext()) {
                linha = fInput.nextLine();
                if (linha.trim().length() > 0) {
                    String[] temp = linha.split(";");
                    ra.addAdministrativo(new Administrativo(temp[0], temp[1]));
                }
            }
            fInput.close();
        } catch(FileNotFoundException e) {
            System.out.println("Não foi possível importar os Administrativos.");
        }
        }
     
     
     
     

    
}
