package com.example.testinterview.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Detail_Transaksi {
    @Id
    @GeneratedValue(generator = "strategy-uuid")
    @GenericGenerator(strategy = "uuid", name = "uuid" )
    private String id;

    @ManyToOne(targetEntity = Transaksi.class, fetch = FetchType.EAGER)
    private Transaksi transaksi;

    @ManyToOne(targetEntity = Obat.class, fetch = FetchType.EAGER)
    private Obat obat;

    private Integer quantity;

    private Integer harga;

    private Integer sub_total;

    public Detail_Transaksi() {
    }

    public Detail_Transaksi(Transaksi transaksi, Obat obat, Integer quantity, Integer harga, Integer sub_total) {
        this.transaksi = transaksi;
        this.obat = obat;
        this.quantity = quantity;
        this.harga = harga;
        this.sub_total = sub_total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getSub_total() {
        return sub_total;
    }

    public void setSub_total(Integer sub_total) {
        this.sub_total = sub_total;
    }
}
