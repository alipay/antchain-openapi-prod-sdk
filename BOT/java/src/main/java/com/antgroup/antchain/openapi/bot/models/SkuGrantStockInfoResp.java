// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SkuGrantStockInfoResp extends TeaModel {
    // 产品型号
    /**
     * <strong>example:</strong>
     * <p>TEST-MODEL-0001</p>
     */
    @NameInMap("product_model")
    public String productModel;

    // 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
    /**
     * <strong>example:</strong>
     * <p>SOFTWARE_HARDWARE</p>
     */
    @NameInMap("product_form")
    public String productForm;

    // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
    /**
     * <strong>example:</strong>
     * <p>[&quot;PAYMENT&quot;]</p>
     */
    @NameInMap("features")
    public java.util.List<String> features;

    // 授权数量(指当前证书凭证种类下未消耗的证书数量)
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cert_num")
    public Long certNum;

    public static SkuGrantStockInfoResp build(java.util.Map<String, ?> map) throws Exception {
        SkuGrantStockInfoResp self = new SkuGrantStockInfoResp();
        return TeaModel.build(map, self);
    }

    public SkuGrantStockInfoResp setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public SkuGrantStockInfoResp setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public SkuGrantStockInfoResp setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public SkuGrantStockInfoResp setCertNum(Long certNum) {
        this.certNum = certNum;
        return this;
    }
    public Long getCertNum() {
        return this.certNum;
    }

}
