// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class BillingPlanVO extends TeaModel {
    // 计费规则code
    /**
     * <strong>example:</strong>
     * <p>计费规则code</p>
     */
    @NameInMap("billing_rule_code")
    public String billingRuleCode;

    // 计量域code
    /**
     * <strong>example:</strong>
     * <p>domain_code</p>
     */
    @NameInMap("domain_code")
    public String domainCode;

    // 产品名称 -> 商品模型2.0中的渠道产品Code
    /**
     * <strong>example:</strong>
     * <p>DYC</p>
     */
    @NameInMap("product_code")
    public String productCode;

    // 商品名称 -> 商品模型2.0中的offerInnerCode
    /**
     * <strong>example:</strong>
     * <p>twc_post</p>
     */
    @NameInMap("offer_code")
    public String offerCode;

    // 采集维度，主实例/逻辑实例，默认主实例
    /**
     * <strong>example:</strong>
     * <p>mterid#instanceId</p>
     */
    @NameInMap("bill_dimension")
    public String billDimension;

    // 是否启用资源包，默认是
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("enable_resource_package")
    public Boolean enableResourcePackage;

    // 累计模式(月/年/指定时间)
    /**
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("cumulate_cycle")
    public String cumulateCycle;

    // 转账类型(数字商品户解冻/文娱链户解冻/权益宝户解冻)，默认空
    /**
     * <strong>example:</strong>
     * <p>文娱链户解冻</p>
     */
    @NameInMap("transfer_type")
    public String transferType;

    // 支付类型(代扣)，默认空
    /**
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("pay_accept_type")
    public String payAcceptType;

    // 核销类型(业务侧)，默认空
    /**
     * <strong>example:</strong>
     * <p>核销类型(业务侧)，默认空</p>
     */
    @NameInMap("write_off_type")
    public String writeOffType;

    // 单次计价最大价格保护（元），默认1000000元
    /**
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("max_price_yuan")
    public String maxPriceYuan;

    // 计费因子
    @NameInMap("billingfactor_metas")
    public java.util.List<BillingFactorMeta> billingfactorMetas;

    // 受理类型
    /**
     * <strong>example:</strong>
     * <p>send</p>
     */
    @NameInMap("accept_type")
    public String acceptType;

    // 周期
    /**
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("collect_period")
    public String collectPeriod;

    // 外部支付类型
    /**
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("out_paid_type")
    public String outPaidType;

    // 是否立即出账
    /**
     * <strong>example:</strong>
     * <p>true,false</p>
     */
    @NameInMap("enable_right_row_charge")
    public Boolean enableRightRowCharge;

    // 高精度累计类型
    /**
     * <strong>example:</strong>
     * <p>HIGH_PRECISION_S_M</p>
     */
    @NameInMap("high_precision_cumulative_type")
    public String highPrecisionCumulativeType;

    public static BillingPlanVO build(java.util.Map<String, ?> map) throws Exception {
        BillingPlanVO self = new BillingPlanVO();
        return TeaModel.build(map, self);
    }

    public BillingPlanVO setBillingRuleCode(String billingRuleCode) {
        this.billingRuleCode = billingRuleCode;
        return this;
    }
    public String getBillingRuleCode() {
        return this.billingRuleCode;
    }

    public BillingPlanVO setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public BillingPlanVO setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public BillingPlanVO setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public BillingPlanVO setBillDimension(String billDimension) {
        this.billDimension = billDimension;
        return this;
    }
    public String getBillDimension() {
        return this.billDimension;
    }

    public BillingPlanVO setEnableResourcePackage(Boolean enableResourcePackage) {
        this.enableResourcePackage = enableResourcePackage;
        return this;
    }
    public Boolean getEnableResourcePackage() {
        return this.enableResourcePackage;
    }

    public BillingPlanVO setCumulateCycle(String cumulateCycle) {
        this.cumulateCycle = cumulateCycle;
        return this;
    }
    public String getCumulateCycle() {
        return this.cumulateCycle;
    }

    public BillingPlanVO setTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }
    public String getTransferType() {
        return this.transferType;
    }

    public BillingPlanVO setPayAcceptType(String payAcceptType) {
        this.payAcceptType = payAcceptType;
        return this;
    }
    public String getPayAcceptType() {
        return this.payAcceptType;
    }

    public BillingPlanVO setWriteOffType(String writeOffType) {
        this.writeOffType = writeOffType;
        return this;
    }
    public String getWriteOffType() {
        return this.writeOffType;
    }

    public BillingPlanVO setMaxPriceYuan(String maxPriceYuan) {
        this.maxPriceYuan = maxPriceYuan;
        return this;
    }
    public String getMaxPriceYuan() {
        return this.maxPriceYuan;
    }

    public BillingPlanVO setBillingfactorMetas(java.util.List<BillingFactorMeta> billingfactorMetas) {
        this.billingfactorMetas = billingfactorMetas;
        return this;
    }
    public java.util.List<BillingFactorMeta> getBillingfactorMetas() {
        return this.billingfactorMetas;
    }

    public BillingPlanVO setAcceptType(String acceptType) {
        this.acceptType = acceptType;
        return this;
    }
    public String getAcceptType() {
        return this.acceptType;
    }

    public BillingPlanVO setCollectPeriod(String collectPeriod) {
        this.collectPeriod = collectPeriod;
        return this;
    }
    public String getCollectPeriod() {
        return this.collectPeriod;
    }

    public BillingPlanVO setOutPaidType(String outPaidType) {
        this.outPaidType = outPaidType;
        return this;
    }
    public String getOutPaidType() {
        return this.outPaidType;
    }

    public BillingPlanVO setEnableRightRowCharge(Boolean enableRightRowCharge) {
        this.enableRightRowCharge = enableRightRowCharge;
        return this;
    }
    public Boolean getEnableRightRowCharge() {
        return this.enableRightRowCharge;
    }

    public BillingPlanVO setHighPrecisionCumulativeType(String highPrecisionCumulativeType) {
        this.highPrecisionCumulativeType = highPrecisionCumulativeType;
        return this;
    }
    public String getHighPrecisionCumulativeType() {
        return this.highPrecisionCumulativeType;
    }

}
