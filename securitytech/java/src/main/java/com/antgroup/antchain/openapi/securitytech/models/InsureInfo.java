// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class InsureInfo extends TeaModel {
    // 保单时间
    @NameInMap("modify_time")
    @Validation(required = true)
    public String modifyTime;

    // 蚂蚁L5产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 保险产品code
    @NameInMap("insure_product")
    @Validation(required = true)
    public String insureProduct;

    // 保险产品价格
    @NameInMap("insure_price")
    @Validation(required = true)
    public String insurePrice;

    // 保险品种
    @NameInMap("insure_type")
    @Validation(required = true)
    public String insureType;

    // 付款方式
    @NameInMap("pay_type")
    @Validation(required = true)
    public String payType;

    // 保险期数
    @NameInMap("insure_period")
    @Validation(required = true)
    public String insurePeriod;

    // 保单状态
    @NameInMap("policy_status")
    @Validation(required = true)
    public String policyStatus;

    // 操作类型
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 保司信用代码
    @NameInMap("insure_comp_credit_no")
    @Validation(required = true)
    public String insureCompCreditNo;

    public static InsureInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureInfo self = new InsureInfo();
        return TeaModel.build(map, self);
    }

    public InsureInfo setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public InsureInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InsureInfo setInsureProduct(String insureProduct) {
        this.insureProduct = insureProduct;
        return this;
    }
    public String getInsureProduct() {
        return this.insureProduct;
    }

    public InsureInfo setInsurePrice(String insurePrice) {
        this.insurePrice = insurePrice;
        return this;
    }
    public String getInsurePrice() {
        return this.insurePrice;
    }

    public InsureInfo setInsureType(String insureType) {
        this.insureType = insureType;
        return this;
    }
    public String getInsureType() {
        return this.insureType;
    }

    public InsureInfo setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public InsureInfo setInsurePeriod(String insurePeriod) {
        this.insurePeriod = insurePeriod;
        return this;
    }
    public String getInsurePeriod() {
        return this.insurePeriod;
    }

    public InsureInfo setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public InsureInfo setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public InsureInfo setInsureCompCreditNo(String insureCompCreditNo) {
        this.insureCompCreditNo = insureCompCreditNo;
        return this;
    }
    public String getInsureCompCreditNo() {
        return this.insureCompCreditNo;
    }

}
