// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class RepayCbrfClaimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请报案人的名称
    @NameInMap("reporter_name")
    @Validation(maxLength = 200)
    public String reporterName;

    // 申请报案人的联系方式
    @NameInMap("reporter_phone_num")
    @Validation(maxLength = 20)
    public String reporterPhoneNum;

    // 理赔时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("claim_time")
    @Validation(required = true, maxLength = 50)
    public String claimTime;

    // 依据实际情况计算的理赔金额，单位元
    @NameInMap("claim_amount")
    @Validation(required = true, maxLength = 20)
    public String claimAmount;

    // 部分保司所需关联的投保响应编码
    @NameInMap("insured_receipt_no")
    @Validation(required = true, maxLength = 200)
    public String insuredReceiptNo;

    // PICC-人保
    @NameInMap("insurance_code")
    @Validation(required = true, maxLength = 32)
    public String insuranceCode;

    // 02-跨境退货运费险
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 2)
    public String productCode;

    // 保司出具的保单编号
    @NameInMap("policy_no")
    @Validation(required = true, maxLength = 50)
    public String policyNo;

    // 客户的订单编号
    @NameInMap("related_order_no")
    @Validation(required = true, maxLength = 150)
    public String relatedOrderNo;

    // 此包裹的成交撮合的电商平台名称
    @NameInMap("ecommerce_platform_name")
    @Validation(required = true, maxLength = 200)
    public String ecommercePlatformName;

    // 承运此包裹的物流CP商名称
    @NameInMap("logistics_provider")
    @Validation(required = true, maxLength = 200)
    public String logisticsProvider;

    // 商家唯一脱敏的编码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 200)
    public String merchantId;

    // 买家唯一脱敏的编码
    @NameInMap("buyer_id")
    @Validation(required = true, maxLength = 200)
    public String buyerId;

    // 货物重量，单位（kg）
    @NameInMap("cargo_weight")
    @Validation(required = true, maxLength = 50)
    public String cargoWeight;

    // 货物类型的大类
    @NameInMap("cargo_type")
    @Validation(required = true, maxLength = 200)
    public String cargoType;

    // 实际的货物名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 200)
    public String cargoName;

    // 到达国内仓时间 yyyy-MM-dd HH:mm:ss
    @NameInMap("dwa_time")
    @Validation(maxLength = 50)
    public String dwaTime;

    // 2位ISO缩写
    @NameInMap("dest_country")
    @Validation(required = true, maxLength = 32)
    public String destCountry;

    // 索赔材料信息
    // 数组内最多10项，url长度限制最大500，name长度限制最大200
    @NameInMap("claim_informations")
    public java.util.List<ClaimInformation> claimInformations;

    public static RepayCbrfClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayCbrfClaimRequest self = new RepayCbrfClaimRequest();
        return TeaModel.build(map, self);
    }

    public RepayCbrfClaimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayCbrfClaimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayCbrfClaimRequest setReporterName(String reporterName) {
        this.reporterName = reporterName;
        return this;
    }
    public String getReporterName() {
        return this.reporterName;
    }

    public RepayCbrfClaimRequest setReporterPhoneNum(String reporterPhoneNum) {
        this.reporterPhoneNum = reporterPhoneNum;
        return this;
    }
    public String getReporterPhoneNum() {
        return this.reporterPhoneNum;
    }

    public RepayCbrfClaimRequest setClaimTime(String claimTime) {
        this.claimTime = claimTime;
        return this;
    }
    public String getClaimTime() {
        return this.claimTime;
    }

    public RepayCbrfClaimRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public RepayCbrfClaimRequest setInsuredReceiptNo(String insuredReceiptNo) {
        this.insuredReceiptNo = insuredReceiptNo;
        return this;
    }
    public String getInsuredReceiptNo() {
        return this.insuredReceiptNo;
    }

    public RepayCbrfClaimRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    public RepayCbrfClaimRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RepayCbrfClaimRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public RepayCbrfClaimRequest setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo;
        return this;
    }
    public String getRelatedOrderNo() {
        return this.relatedOrderNo;
    }

    public RepayCbrfClaimRequest setEcommercePlatformName(String ecommercePlatformName) {
        this.ecommercePlatformName = ecommercePlatformName;
        return this;
    }
    public String getEcommercePlatformName() {
        return this.ecommercePlatformName;
    }

    public RepayCbrfClaimRequest setLogisticsProvider(String logisticsProvider) {
        this.logisticsProvider = logisticsProvider;
        return this;
    }
    public String getLogisticsProvider() {
        return this.logisticsProvider;
    }

    public RepayCbrfClaimRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RepayCbrfClaimRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public RepayCbrfClaimRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public RepayCbrfClaimRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public RepayCbrfClaimRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public RepayCbrfClaimRequest setDwaTime(String dwaTime) {
        this.dwaTime = dwaTime;
        return this;
    }
    public String getDwaTime() {
        return this.dwaTime;
    }

    public RepayCbrfClaimRequest setDestCountry(String destCountry) {
        this.destCountry = destCountry;
        return this;
    }
    public String getDestCountry() {
        return this.destCountry;
    }

    public RepayCbrfClaimRequest setClaimInformations(java.util.List<ClaimInformation> claimInformations) {
        this.claimInformations = claimInformations;
        return this;
    }
    public java.util.List<ClaimInformation> getClaimInformations() {
        return this.claimInformations;
    }

}
