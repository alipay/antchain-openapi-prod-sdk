// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ComboItemDTO extends TeaModel {
    // 主键ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("id")
    public Long id;

    // 唯一编码
    /**
     * <strong>example:</strong>
     * <p>123xxx</p>
     */
    @NameInMap("unique_code")
    public String uniqueCode;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>xxx商品</p>
     */
    @NameInMap("offer_name")
    public String offerName;

    // 商品主数据CODE
    /**
     * <strong>example:</strong>
     * <p>sf12321xxx</p>
     */
    @NameInMap("offer_inner_code")
    public String offerInnerCode;

    // 商品销售CODE（仅当指定 ou 且商品在该 OU 下上架时有值）
    /**
     * <strong>example:</strong>
     * <p>sf123xxxx</p>
     */
    @NameInMap("offer_sale_code")
    public String offerSaleCode;

    // 商品规格，JSON 结构
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("offer_attr")
    public String offerAttr;

    // 商品规格描述
    /**
     * <strong>example:</strong>
     * <p>xxx描述</p>
     */
    @NameInMap("offer_attr_desc")
    public String offerAttrDesc;

    // 付费方式（如 AFTER_PAY_BY_HOUR 后付费量价、PREPAY_BY_MONTH 预付费包年包月）
    /**
     * <strong>example:</strong>
     * <p>AFTER_PAY_BY_HOUR</p>
     */
    @NameInMap("charge_type")
    public String chargeType;

    // 商品数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    // 订购周期类型
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("duration_type")
    public String durationType;

    // 订购周期值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration_value")
    public Long durationValue;

    // 是否必选（true 必选，false 可选）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    public Boolean required;

    // 商品在套餐中的排序
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("seq_order")
    public Long seqOrder;

    // 扩展配置
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extends_config")
    public String extendsConfig;

    // 商品规格 JSON 结构，CommodityInfo 的 JSON 序列化字符串
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("offer_attr_option")
    public String offerAttrOption;

    public static ComboItemDTO build(java.util.Map<String, ?> map) throws Exception {
        ComboItemDTO self = new ComboItemDTO();
        return TeaModel.build(map, self);
    }

    public ComboItemDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ComboItemDTO setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public ComboItemDTO setOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }
    public String getOfferName() {
        return this.offerName;
    }

    public ComboItemDTO setOfferInnerCode(String offerInnerCode) {
        this.offerInnerCode = offerInnerCode;
        return this;
    }
    public String getOfferInnerCode() {
        return this.offerInnerCode;
    }

    public ComboItemDTO setOfferSaleCode(String offerSaleCode) {
        this.offerSaleCode = offerSaleCode;
        return this;
    }
    public String getOfferSaleCode() {
        return this.offerSaleCode;
    }

    public ComboItemDTO setOfferAttr(String offerAttr) {
        this.offerAttr = offerAttr;
        return this;
    }
    public String getOfferAttr() {
        return this.offerAttr;
    }

    public ComboItemDTO setOfferAttrDesc(String offerAttrDesc) {
        this.offerAttrDesc = offerAttrDesc;
        return this;
    }
    public String getOfferAttrDesc() {
        return this.offerAttrDesc;
    }

    public ComboItemDTO setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ComboItemDTO setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public ComboItemDTO setDurationType(String durationType) {
        this.durationType = durationType;
        return this;
    }
    public String getDurationType() {
        return this.durationType;
    }

    public ComboItemDTO setDurationValue(Long durationValue) {
        this.durationValue = durationValue;
        return this;
    }
    public Long getDurationValue() {
        return this.durationValue;
    }

    public ComboItemDTO setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ComboItemDTO setSeqOrder(Long seqOrder) {
        this.seqOrder = seqOrder;
        return this;
    }
    public Long getSeqOrder() {
        return this.seqOrder;
    }

    public ComboItemDTO setExtendsConfig(String extendsConfig) {
        this.extendsConfig = extendsConfig;
        return this;
    }
    public String getExtendsConfig() {
        return this.extendsConfig;
    }

    public ComboItemDTO setOfferAttrOption(String offerAttrOption) {
        this.offerAttrOption = offerAttrOption;
        return this;
    }
    public String getOfferAttrOption() {
        return this.offerAttrOption;
    }

}
