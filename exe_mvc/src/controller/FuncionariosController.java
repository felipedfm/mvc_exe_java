/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Funcionarios;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author canelamah
 */
public class FuncionariosController extends AbstractTableModel{
    ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    
   String [] colunas = {"nome","cpf","salario", "funcao"};
    @Override
    public int getRowCount(){
    return funcionarios.size();
    }
    @Override
    public int getColumnCount(){
    return colunas.length;
    }
    @Override
    public String getColumnName (int column){
    return colunas[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
    if (columnIndex == 0){
        return funcionarios.get(rowIndex).getNome();
    }
    else if (columnIndex == 1){
    return funcionarios.get(rowIndex).getCpf;
        
    }
    }
    
    
