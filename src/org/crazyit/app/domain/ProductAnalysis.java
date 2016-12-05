package org.crazyit.app.domain;

import javax.persistence.*;

/**
 * Created by yuume on 16/12/5.
 */

@Entity
@Table(name = "oms_product_Analysis")
public class ProductAnalysis {
    // 产品分析类标识属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // 产品Id
    private Integer i_productId;
    // 产品名称
    private String str_productName;
    //分析维度Id
    private Integer i_dimensionId;
    //分析维度名称
    private String str_dimensionName;
    //分析维度默认值
    private Integer i_valueDefault;

    // Id 的setter和getter方法
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getId()
    {
        return this.id;
    }

    // 产品Id 的setter和getter方法
    public void setI_productId(Integer i_productId) { this.i_productId = i_productId; }
    public Integer getI_productId() { return this.i_productId; }

    // 产品名称 的setter和getter方法
    public void setStr_productName(String str_productName) { this.str_productName = str_productName; }
    public String getStr_productName() { return this.str_productName; }

    // 分析维度Id 的setter和getter方法
    public void setI_dimensionId(Integer i_dimensionId) { this.i_dimensionId = i_dimensionId; }
    public Integer getI_dimensionId() { return this.i_dimensionId; }

    // 分析维度名称 的setter和getter方法
    public void setStr_dimensionName(String str_dimensionName) { this.str_dimensionName = str_dimensionName; }
    public String getStr_dimensionName() { return str_dimensionName; }

    // 分析维度默认值 的setter和getter方法
    public void setI_valueDefault(Integer i_valueDefault) { this.i_valueDefault = i_valueDefault; }
    public Integer getI_valueDefault() { return this.i_valueDefault; }

}
