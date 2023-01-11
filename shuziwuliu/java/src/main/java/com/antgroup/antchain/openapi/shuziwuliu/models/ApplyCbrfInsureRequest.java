// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyCbrfInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("insurance_code")
    @Validation(required = true, maxLength = 32)
    public String insuranceCode;

    // 险种编码
    // 
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 2)
    public String productCode;

    // 保险协议中的投保人全称
    @NameInMap("policyholder_name")
    @Validation(required = true, maxLength = 200)
    public String policyholderName;

    // 投保人证件类型，01--居民身份证、03--营业执照
    @NameInMap("policyholder_id_type")
    @Validation(required = true, maxLength = 2)
    public String policyholderIdType;

    // 投保人证件号码
    @NameInMap("policyholder_id_no")
    @Validation(required = true, maxLength = 50)
    public String policyholderIdNo;

    // 被保人姓名，实际的保险被保人名称
    @NameInMap("insured_name")
    @Validation(required = true, maxLength = 200)
    public String insuredName;

    // 被保人证件类型，01--居民身份证、03--营业执照
    @NameInMap("insured_id_type")
    @Validation(required = true, maxLength = 2)
    public String insuredIdType;

    // 被保人证件号码
    @NameInMap("insured_id_no")
    @Validation(required = true, maxLength = 50)
    public String insuredIdNo;

    // 受益人名称，实际的保险受益人名称
    @NameInMap("beneficiary_name")
    @Validation(maxLength = 200)
    public String beneficiaryName;

    // 受益人证件类型，01--居民身份证、03--营业执照
    @NameInMap("beneficiary_id_type")
    @Validation(maxLength = 2)
    public String beneficiaryIdType;

    // 受益人证件号码
    @NameInMap("beneficiary_id_no")
    @Validation(maxLength = 50)
    public String beneficiaryIdNo;

    // 保司针对当前的项目所给的方案名
    @NameInMap("scheme_name")
    @Validation(required = true, maxLength = 200)
    public String schemeName;

    // 保司针对当前的项目所给的项目名
    @NameInMap("project_name")
    @Validation(maxLength = 200)
    public String projectName;

    // 保险金额，单位（元），最多支持2位小数，超过2位拒绝
    @NameInMap("insurance_amount")
    @Validation(maxLength = 20)
    public String insuranceAmount;

    // 保险起期,yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_start")
    @Validation(required = true, maxLength = 50)
    public String insureStart;

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

    // 货物的揽收时间
    @NameInMap("collection_time")
    @Validation(maxLength = 50)
    public String collectionTime;

    // yyyy-MM-dd HH:mm:ss 交付航司确认的时间
    @NameInMap("delivery_time")
    @Validation(required = true, maxLength = 50)
    public String deliveryTime;

    // 2位ISO缩写
    @NameInMap("dest_country")
    @Validation(required = true, maxLength = 32)
    public String destCountry;

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

    // 货物的美金商品价值
    @NameInMap("cargo_value")
    @Validation(required = true, maxLength = 20)
    public String cargoValue;

    public static ApplyCbrfInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCbrfInsureRequest self = new ApplyCbrfInsureRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCbrfInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCbrfInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCbrfInsureRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    public ApplyCbrfInsureRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ApplyCbrfInsureRequest setPolicyholderName(String policyholderName) {
        this.policyholderName = policyholderName;
        return this;
    }
    public String getPolicyholderName() {
        return this.policyholderName;
    }

    public ApplyCbrfInsureRequest setPolicyholderIdType(String policyholderIdType) {
        this.policyholderIdType = policyholderIdType;
        return this;
    }
    public String getPolicyholderIdType() {
        return this.policyholderIdType;
    }

    public ApplyCbrfInsureRequest setPolicyholderIdNo(String policyholderIdNo) {
        this.policyholderIdNo = policyholderIdNo;
        return this;
    }
    public String getPolicyholderIdNo() {
        return this.policyholderIdNo;
    }

    public ApplyCbrfInsureRequest setInsuredName(String insuredName) {
        this.insuredName = insuredName;
        return this;
    }
    public String getInsuredName() {
        return this.insuredName;
    }

    public ApplyCbrfInsureRequest setInsuredIdType(String insuredIdType) {
        this.insuredIdType = insuredIdType;
        return this;
    }
    public String getInsuredIdType() {
        return this.insuredIdType;
    }

    public ApplyCbrfInsureRequest setInsuredIdNo(String insuredIdNo) {
        this.insuredIdNo = insuredIdNo;
        return this;
    }
    public String getInsuredIdNo() {
        return this.insuredIdNo;
    }

    public ApplyCbrfInsureRequest setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        return this;
    }
    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public ApplyCbrfInsureRequest setBeneficiaryIdType(String beneficiaryIdType) {
        this.beneficiaryIdType = beneficiaryIdType;
        return this;
    }
    public String getBeneficiaryIdType() {
        return this.beneficiaryIdType;
    }

    public ApplyCbrfInsureRequest setBeneficiaryIdNo(String beneficiaryIdNo) {
        this.beneficiaryIdNo = beneficiaryIdNo;
        return this;
    }
    public String getBeneficiaryIdNo() {
        return this.beneficiaryIdNo;
    }

    public ApplyCbrfInsureRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public ApplyCbrfInsureRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ApplyCbrfInsureRequest setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }
    public String getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public ApplyCbrfInsureRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyCbrfInsureRequest setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo;
        return this;
    }
    public String getRelatedOrderNo() {
        return this.relatedOrderNo;
    }

    public ApplyCbrfInsureRequest setEcommercePlatformName(String ecommercePlatformName) {
        this.ecommercePlatformName = ecommercePlatformName;
        return this;
    }
    public String getEcommercePlatformName() {
        return this.ecommercePlatformName;
    }

    public ApplyCbrfInsureRequest setLogisticsProvider(String logisticsProvider) {
        this.logisticsProvider = logisticsProvider;
        return this;
    }
    public String getLogisticsProvider() {
        return this.logisticsProvider;
    }

    public ApplyCbrfInsureRequest setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
        return this;
    }
    public String getCollectionTime() {
        return this.collectionTime;
    }

    public ApplyCbrfInsureRequest setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public ApplyCbrfInsureRequest setDestCountry(String destCountry) {
        this.destCountry = destCountry;
        return this;
    }
    public String getDestCountry() {
        return this.destCountry;
    }

    public ApplyCbrfInsureRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyCbrfInsureRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public ApplyCbrfInsureRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public ApplyCbrfInsureRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public ApplyCbrfInsureRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public ApplyCbrfInsureRequest setCargoValue(String cargoValue) {
        this.cargoValue = cargoValue;
        return this;
    }
    public String getCargoValue() {
        return this.cargoValue;
    }

}
