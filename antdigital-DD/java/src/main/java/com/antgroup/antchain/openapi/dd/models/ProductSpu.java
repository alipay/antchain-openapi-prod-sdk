// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ProductSpu extends TeaModel {
    // SPU编码
    /**
     * <strong>example:</strong>
     * <p>QYBBSPU00000001</p>
     */
    @NameInMap("spu_code")
    @Validation(required = true)
    public String spuCode;

    // SPU名称
    /**
     * <strong>example:</strong>
     * <p>积分兑换</p>
     */
    @NameInMap("spu_name")
    @Validation(required = true)
    public String spuName;

    // spu描述
    /**
     * <strong>example:</strong>
     * <p>积分兑换场景</p>
     */
    @NameInMap("spu_desc")
    @Validation(required = true)
    public String spuDesc;

    // 交付模式，ONLINE/OFFLINE
    /**
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("delivery_mode")
    @Validation(required = true)
    public String deliveryMode;

    // 归属产品码
    /**
     * <strong>example:</strong>
     * <p>QYBB</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 是否涉及一方化 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("involved_one_party")
    @Validation(required = true)
    public Boolean involvedOneParty;

    // technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
    /**
     * <strong>example:</strong>
     * <p>solution_se</p>
     */
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
