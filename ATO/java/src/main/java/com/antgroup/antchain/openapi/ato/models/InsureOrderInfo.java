// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InsureOrderInfo extends TeaModel {
    // 商家订单ID
    /**
     * <strong>example:</strong>
     * <p>F20240531174508229522</p>
     */
    @NameInMap("order_id")
    public String orderId;

    // 投保编号（承保id）
    /**
     * <strong>example:</strong>
     * <p>T20240531174508229522</p>
     */
    @NameInMap("insure_id")
    public String insureId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>华为meta60</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 保险开始时间
    /**
     * <strong>example:</strong>
     * <p>2024-09-24 20:04:35</p>
     */
    @NameInMap("insure_start_time")
    public String insureStartTime;

    // 保险终止时间
    /**
     * <strong>example:</strong>
     * <p>2024-09-24 20:04:35</p>
     */
    @NameInMap("insure_end_time")
    public String insureEndTime;

    // 投保金额（保额），单位分 100代表1元
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("insure_amount")
    public Long insureAmount;

    // 投保费用（保费），单位分 100代表1元
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("insure_premium")
    public Long insurePremium;

    // 投保状态枚举
    /**
     * <strong>example:</strong>
     * <p>INSURE_SUCC</p>
     */
    @NameInMap("status")
    public String status;

    // 电子保单下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://test-open.pingan.com.cn/Gateway/xxxxx/printGPForDMZ?ciphertext=$%7Bciphertext%7D&sign=$%7Bsign%7D">https://test-open.pingan.com.cn/Gateway/xxxxx/printGPForDMZ?ciphertext=${ciphertext}&amp;sign=${sign}</a></p>
     */
    @NameInMap("policy_url")
    public String policyUrl;

    // 验真码
    /**
     * <strong>example:</strong>
     * <p>9u649pfJ76crNdRRVD</p>
     */
    @NameInMap("validate_code")
    public String validateCode;

    public static InsureOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderInfo self = new InsureOrderInfo();
        return TeaModel.build(map, self);
    }

    public InsureOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InsureOrderInfo setInsureId(String insureId) {
        this.insureId = insureId;
        return this;
    }
    public String getInsureId() {
        return this.insureId;
    }

    public InsureOrderInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public InsureOrderInfo setInsureStartTime(String insureStartTime) {
        this.insureStartTime = insureStartTime;
        return this;
    }
    public String getInsureStartTime() {
        return this.insureStartTime;
    }

    public InsureOrderInfo setInsureEndTime(String insureEndTime) {
        this.insureEndTime = insureEndTime;
        return this;
    }
    public String getInsureEndTime() {
        return this.insureEndTime;
    }

    public InsureOrderInfo setInsureAmount(Long insureAmount) {
        this.insureAmount = insureAmount;
        return this;
    }
    public Long getInsureAmount() {
        return this.insureAmount;
    }

    public InsureOrderInfo setInsurePremium(Long insurePremium) {
        this.insurePremium = insurePremium;
        return this;
    }
    public Long getInsurePremium() {
        return this.insurePremium;
    }

    public InsureOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InsureOrderInfo setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }
    public String getPolicyUrl() {
        return this.policyUrl;
    }

    public InsureOrderInfo setValidateCode(String validateCode) {
        this.validateCode = validateCode;
        return this;
    }
    public String getValidateCode() {
        return this.validateCode;
    }

}
