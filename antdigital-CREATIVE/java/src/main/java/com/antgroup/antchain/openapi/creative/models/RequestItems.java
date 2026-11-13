// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class RequestItems extends TeaModel {
    // 规则编码
    /**
     * <strong>example:</strong>
     * <p>规则编码</p>
     */
    @NameInMap("price_rule_code")
    public String priceRuleCode;

    // 收费项编码
    /**
     * <strong>example:</strong>
     * <p>收费项编码</p>
     */
    @NameInMap("charge_item_code")
    public String chargeItemCode;

    // 计量指标类型
    /**
     * <strong>example:</strong>
     * <p>计量指标类型</p>
     */
    @NameInMap("metric_type")
    public String metricType;

    // 原始计量数量
    /**
     * <strong>example:</strong>
     * <p>原始计量数量</p>
     */
    @NameInMap("quantity")
    public String quantity;

    // 免费额度
    /**
     * <strong>example:</strong>
     * <p>免费额度</p>
     */
    @NameInMap("free_quota")
    public String freeQuota;

    // 计费数量（扣除免费额度后的值）
    /**
     * <strong>example:</strong>
     * <p>计费数量（扣除免费额度后的值）</p>
     */
    @NameInMap("billable_quantity")
    public String billableQuantity;

    // 计费单位大小
    /**
     * <strong>example:</strong>
     * <p>计费单位大小</p>
     */
    @NameInMap("unit_size")
    public String unitSize;

    // 单价
    /**
     * <strong>example:</strong>
     * <p>单价</p>
     */
    @NameInMap("unit_price")
    public String unitPrice;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>币种</p>
     */
    @NameInMap("currency")
    public String currency;

    // 单项金额
    /**
     * <strong>example:</strong>
     * <p>单项金额</p>
     */
    @NameInMap("amount")
    public String amount;

    public static RequestItems build(java.util.Map<String, ?> map) throws Exception {
        RequestItems self = new RequestItems();
        return TeaModel.build(map, self);
    }

    public RequestItems setPriceRuleCode(String priceRuleCode) {
        this.priceRuleCode = priceRuleCode;
        return this;
    }
    public String getPriceRuleCode() {
        return this.priceRuleCode;
    }

    public RequestItems setChargeItemCode(String chargeItemCode) {
        this.chargeItemCode = chargeItemCode;
        return this;
    }
    public String getChargeItemCode() {
        return this.chargeItemCode;
    }

    public RequestItems setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public RequestItems setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public RequestItems setFreeQuota(String freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }
    public String getFreeQuota() {
        return this.freeQuota;
    }

    public RequestItems setBillableQuantity(String billableQuantity) {
        this.billableQuantity = billableQuantity;
        return this;
    }
    public String getBillableQuantity() {
        return this.billableQuantity;
    }

    public RequestItems setUnitSize(String unitSize) {
        this.unitSize = unitSize;
        return this;
    }
    public String getUnitSize() {
        return this.unitSize;
    }

    public RequestItems setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

    public RequestItems setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public RequestItems setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}
