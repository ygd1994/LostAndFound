package com.example.ygd.lostandfound.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "comments".
 */
public class Comments {

    private Long id;
    private String s_id;
    private String cDate;
    private String cContent;
    private String n_id;
    private Integer cAgree;

    public Comments() {
    }

    public Comments(Long id) {
        this.id = id;
    }

    public Comments(Long id, String s_id, String cDate, String cContent, String n_id, Integer cAgree) {
        this.id = id;
        this.s_id = s_id;
        this.cDate = cDate;
        this.cContent = cContent;
        this.n_id = n_id;
        this.cAgree = cAgree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getCDate() {
        return cDate;
    }

    public void setCDate(String cDate) {
        this.cDate = cDate;
    }

    public String getCContent() {
        return cContent;
    }

    public void setCContent(String cContent) {
        this.cContent = cContent;
    }

    public String getN_id() {
        return n_id;
    }

    public void setN_id(String n_id) {
        this.n_id = n_id;
    }

    public Integer getCAgree() {
        return cAgree;
    }

    public void setCAgree(Integer cAgree) {
        this.cAgree = cAgree;
    }

}