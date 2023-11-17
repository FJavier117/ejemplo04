package com.fjavmvazquez.ejemplo04.model.service;

import com.fjavmvazquez.ejemplo04.model.Alumno;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
    public static void add(Alumno alumno, String ruta) {
        File archivo;
        FileWriter fileWriter;
        PrintWriter printWriter = null;

        try{
            archivo = new File(ruta);
            fileWriter = new FileWriter(archivo,true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(alumno.getNombre() +
                    "," + alumno.getApellido() +","+ alumno.getPromedio());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally {
            try
            {
                if (printWriter!= null){
                    printWriter.close();
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
