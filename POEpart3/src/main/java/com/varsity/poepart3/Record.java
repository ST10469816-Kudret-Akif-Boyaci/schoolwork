/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.poepart3;

public class Record {
    private String idnum;
    private String cellNum;
    private String message;
    private String hashnum;
    
    // Getters and setters
    public String getIdnum() { return idnum; }
    public void setIdnum(String idnum) { this.idnum = idnum; }

    public String getCellNum() { return cellNum; }
    public void setCellNum(String cellNum) { this.cellNum = cellNum; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getHashnum() { return hashnum; }
    public void setHashnum(String hashnum) { this.hashnum = hashnum; }
    
    @Override
    public String toString() {
        return "Record{" +
               "idnum='" + idnum + '\'' +
               ", cellNum='" + cellNum + '\'' +
               ", message='" + message + '\'' +
               ", hashnum='" + hashnum + '\'' +
               '}';
    }
}
//        code attribution
//        this method was partially helped by ChatGPT
//        https://openai.com/
//        ChatGPT