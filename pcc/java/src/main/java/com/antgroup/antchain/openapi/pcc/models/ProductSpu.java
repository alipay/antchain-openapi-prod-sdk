// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class ProductSpu extends TeaModel {
    // SPU编码
    @NameInMap("spu_code")
    @Validation(required = true)
    public String spuCode;

    // SPU名称
    @NameInMap("spu_name")
    @Validation(required = true)
    public String spuName;

    // spu描述
    @NameInMap("spu_desc")
    @Validation(required = true)
    public String spuDesc;

    // 交付模式，ONLINE/OFFLINE
    @NameInMap("delivery_mode")
    @Validation(required = true)
    public String deliveryMode;

    // 归属产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 是否涉及一方化 
    @NameInMap("involved_one_party")
    @Validation(required = true)
    public Boolean involvedOneParty;

    // technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
    @NameInMap("segment")
    @Validation(required = true)
    public String segment;

    // sku数据
    @NameInMap("offer_master")
    @Validation(required = true)
    public java.util.List<OfferMaster> offerMaster;

    public static ProductSpu build(java.util.Map<String, ?> map) throws Exception {
        ProductSpu self = new ProductSpu();
        return TeaModel.build(map, self);
    }

    public ProductSpu setSpuCode(String spuCode) {
        this.spuCode = spuCode;
        return this;
    }
    public String getSpuCode() {
        return this.spuCode;
    }

    public ProductSpu setSpuName(String spuName) {
        this.spuName = spuName;
        return this;
    }
    public String getSpuName() {
        return this.spuName;
    }

    public ProductSpu setSpuDesc(String spuDesc) {
        this.spuDesc = spuDesc;
        return this;
    }
    public String getSpuDesc() {
        return this.spuDesc;
    }

    public ProductSpu setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    public String getDeliveryMode() {
        return this.deliveryMode;
    }

    public ProductSpu setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductSpu setInvolvedOneParty(Boolean involvedOneParty) {
        this.involvedOneParty = involvedOneParty;
        return this;
    }
    public Boolean getInvolvedOneParty() {
        return this.involvedOneParty;
    }

    public ProductSpu setSegment(String segment) {
        this.segment = segment;
        return this;
    }
    public String getSegment() {
        return this.segment;
    }

    public ProductSpu setOfferMaster(java.util.List<OfferMaster> offerMaster) {
        this.offerMaster = offerMaster;
        return this;
    }
    public java.util.List<OfferMaster> getOfferMaster() {
        return this.offerMaster;
    }

}
