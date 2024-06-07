package Controller;

import Model.Functions_DAO;
import java.util.ArrayList;
import View.Rios_GUI;
import View.Oceanos_GUI;
import Controller.Rivers;
import Controller.Oceans;

    

public class Database {

    // Declarar a variável rivers como um campo da classe Database
    public static ArrayList<Rivers> rivers = new ArrayList<>();
    public static ArrayList<Oceans> oceans = new ArrayList<>();
    

    public static void Users() {
        Functions_DAO.showUsers();
    }

    public static void Rivers() {
        // Inicializar a lista de rios
        rivers.add(new Rivers("Amazonas", 6.5, 50.0));
        rivers.add(new Rivers("Paraná", 7.0, 30.0));
        rivers.add(new Rivers("São Francisco", 7.2, 20.0));
        rivers.add(new Rivers("Tocantins", 6.8, 25.0));
        rivers.add(new Rivers("Madeira", 6.4, 40.0));
    }
    
    public static void Oceans() {
        oceans.add(new Oceans("Ártico", 6.5, 50.0));
        oceans.add(new Oceans("Atlântico", 7.0, 30.0));
        oceans.add(new Oceans("Pacífico", 7.2, 20.0));
        oceans.add(new Oceans("Índico", 6.8, 25.0));
        oceans.add(new Oceans("Antártico", 6.4, 40.0));
    }
    
    
    }
