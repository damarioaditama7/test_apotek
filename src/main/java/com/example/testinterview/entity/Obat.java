package com.example.testinterview.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Obat {
    @Id
    @GeneratedValue(generator = "strategy-uuid")
    @GenericGenerator(strategy = "uuid", name = "uuid" )
    private String id;

    private String nama;

    private Integer harga;

    private Date kadaluwarsa;

    private Boolean isDeleted;

    public Obat() {
    }

    public Obat(String nama, Integer harga, Date kadaluwarsa, Boolean isDeleted) {
        this.nama = nama;
        this.harga = harga;
        this.kadaluwarsa = kadaluwarsa;
        this.isDeleted = isDeleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Date getKadaluwarsa() {
        return kadaluwarsa;
    }

    public void setKadaluwarsa(Date kadaluwarsa) {
        this.kadaluwarsa = kadaluwarsa;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
