/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.ArrayList;
public class Client implements User{
    
 private ArrayList<String> namaClient = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> saldo = new ArrayList<Integer>();

 public Client() {
 setNama("Anastashia");
 setAlamat("Jalan Danau Ranau G7/H6");
 setTelepon("081576543192");
 setSaldo(150000);

 setNama("Alexander");
 setAlamat("Jalan Danau Toba No.12");
 setTelepon("087567342561");
 setSaldo(290000);
 
 setNama("Arabella");
 setAlamat ("Jalan Danau Towuti No.6");
 setTelepon("082986756842");
 setSaldo(125000);
 
 }
 public void setSaldo(int saldo){
 this.saldo.add(saldo);
 }
 public int getSaldo(int idClient){
 return this.saldo.get(idClient);
 }
 
 public void editSaldo(int idClient, int saldo){
 this.saldo.set(idClient, saldo);
 }
 public int getJmlClient(){
 return this.saldo.size();
 }
 @Override
 public void setNama(String namaClient ){
 this.namaClient.add(namaClient);
 }

 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }

 @Override
 public String getNama(int idClient){
 return this.namaClient.get(idClient);
 }

 @Override
 public String getAlamat(int idClient){
 return this.alamat.get(idClient);
 }

 @Override
 public String getTelepon(int idClient){
 return this.telepon.get(idClient);
 } 
}

