package com.atguigu.gmall.bean;
import com.atguigu.gmall.bean.PmsProductSaleAttrValue;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

public class PmsProductSaleAttr implements Serializable {

    @Id
    @Column
    String id ;

    @Column
    String productId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrName;


    @Transient
    List<PmsProductSaleAttrValue> spuSaleAttrValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public List<PmsProductSaleAttrValue> getSpuSaleAttrValue() {
        return spuSaleAttrValue;
    }

    public void setSpuSaleAttrValue(List<PmsProductSaleAttrValue> spuSaleAttrValue) {
        this.spuSaleAttrValue = spuSaleAttrValue;
    }
}
