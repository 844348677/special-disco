package com.hdd.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by liuh on 2016/1/29.
 */
@Entity
@Table(name="risk")
public class Risk {
    @Id
    private int id;
    @Column(length=60)
    private String applid;
    @Column(length=60)
    private String a11;
    @Column(length=60)
    private String a12;
    @Column(length=60)
    private String a13;
    @Column(length=60)
    private String a14;
    @Column(length=60)
    private String a15;
    @Column(length=60)
    private String a16;
    @Column(length=60)
    private String a17;
    @Column(length=60)
    private String a18;
    @Column(length=60)
    private String a19;
    @Column(length=60)
    private String b11;
    @Column(length=60)
    private String b12;
    @Column(length=60)
    private String b13;
    @Column(length=60)
    private String b14;
    @Column(length=60)
    private String b15;
    @Column(length=60)
    private String b16;
    @Column(length=60)
    private String b17;
    @Column(length=60)
    private String b18;
    @Column(length=60)
    private String b19;
    @Column(length=60)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }

    public String getA14() {
        return a14;
    }

    public void setA14(String a14) {
        this.a14 = a14;
    }

    public String getA15() {
        return a15;
    }

    public void setA15(String a15) {
        this.a15 = a15;
    }

    public String getA16() {
        return a16;
    }

    public void setA16(String a16) {
        this.a16 = a16;
    }

    public String getA17() {
        return a17;
    }

    public void setA17(String a17) {
        this.a17 = a17;
    }

    public String getA18() {
        return a18;
    }

    public void setA18(String a18) {
        this.a18 = a18;
    }

    public String getA19() {
        return a19;
    }

    public void setA19(String a19) {
        this.a19 = a19;
    }

    public String getB11() {
        return b11;
    }

    public void setB11(String b11) {
        this.b11 = b11;
    }

    public String getB12() {
        return b12;
    }

    public void setB12(String b12) {
        this.b12 = b12;
    }

    public String getB13() {
        return b13;
    }

    public void setB13(String b13) {
        this.b13 = b13;
    }

    public String getB14() {
        return b14;
    }

    public void setB14(String b14) {
        this.b14 = b14;
    }

    public String getB15() {
        return b15;
    }

    public void setB15(String b15) {
        this.b15 = b15;
    }

    public String getB16() {
        return b16;
    }

    public void setB16(String b16) {
        this.b16 = b16;
    }

    public String getB17() {
        return b17;
    }

    public void setB17(String b17) {
        this.b17 = b17;
    }

    public String getB18() {
        return b18;
    }

    public void setB18(String b18) {
        this.b18 = b18;
    }

    public String getB19() {
        return b19;
    }

    public void setB19(String b19) {
        this.b19 = b19;
    }

	@Override
	public String toString() {
		return "Risk [id=" + id + ", a11=" + a11 + ", a12=" + a12 + ", a13=" + a13 + ", a14=" + a14 + ", a15=" + a15
				+ ", a16=" + a16 + ", a17=" + a17 + ", a18=" + a18 + ", a19=" + a19 + ", b11=" + b11 + ", b12=" + b12
				+ ", b13=" + b13 + ", b14=" + b14 + ", b15=" + b15 + ", b16=" + b16 + ", b17=" + b17 + ", b18=" + b18
				+ ", b19=" + b19 + "]";
	}

	public String getApplid() {
		return applid;
	}

	public void setApplid(String applid) {
		this.applid = applid;
	}
    
    
    
}
