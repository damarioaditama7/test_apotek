package com.example.testinterview.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Transaksi {

    @Id
    @GeneratedValue(generator = "strategy-uuid")
    @GenericGenerator(strategy = "uuid", name = "uuid" )
    private String id;

    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
    private Customer customer;

    private Date tanggal;

    private Integer total_harga;

    @OneToMany(targetEntity = Detail_Transaksi.class, fetch = FetchType.EAGER)
    private List<Detail_Transaksi> detail_transaksi;

    public Transaksi() {
    }

    public Transaksi(Customer customer, Date tanggal, Integer total_harga, List<Detail_Transaksi> detail_transaksi) {
        this.customer = customer;
        this.tanggal = tanggal;
        this.total_harga = total_harga;
        this.detail_transaksi = detail_transaksi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Integer getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Integer total_harga) {
        this.total_harga = total_harga;
    }

    public List<Detail_Transaksi> getDetail_transaksi() {
        return detail_transaksi;
    }

    public void setDetail_transaksi(List<Detail_Transaksi> detail_transaksi) {
        this.detail_transaksi = detail_transaksi;
    }
}
