// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceCbrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物流公司业务线的简称
    @NameInMap("business_id")
    @Validation(maxLength = 30)
    public String businessId;

    // 保司编码
    @NameInMap("insurance_code")
    @Validation(required = true, maxLength = 8)
    public String insuranceCode;

    // 险种编码
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 2)
    public String productCode;

    // 起保时间
    @NameInMap("insurance_start")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insuranceStart;

    // 交付航司确认时间
    @NameInMap("delivery_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deliveryTime;

    // 客户订单编号
    @NameInMap("related_oder_no")
    @Validation(required = true, maxLength = 256, minLength = 2)
    public String relatedOderNo;

    // 目的国，2位iso缩写
    @NameInMap("dest_country")
    @Validation(required = true, maxLength = 256, minLength = 2)
    public String destCountry;

    // 商家唯一脱敏的编码
    @NameInMap("business_merchant_id")
    @Validation(maxLength = 256)
    public String businessMerchantId;

    // 货物的揽收时间
    @NameInMap("collection_time")
    @Validation(maxLength = 50)
    public String collectionTime;

    // 货物名称
    @NameInMap("good_name")
    @Validation(maxLength = 200)
    public String goodName;

    // 货值(美金)，货物的美金商品价值
    @NameInMap("good_value")
    @Validation(maxLength = 50)
    public String goodValue;

    public static ApplyInsuranceCbrfRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceCbrfRequest self = new ApplyInsuranceCbrfRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceCbrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceCbrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceCbrfRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ApplyInsuranceCbrfRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    public ApplyInsuranceCbrfRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ApplyInsuranceCbrfRequest setInsuranceStart(String insuranceStart) {
        this.insuranceStart = insuranceStart;
        return this;
    }
    public String getInsuranceStart() {
        return this.insuranceStart;
    }

    public ApplyInsuranceCbrfRequest setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public ApplyInsuranceCbrfRequest setRelatedOderNo(String relatedOderNo) {
        this.relatedOderNo = relatedOderNo;
        return this;
    }
    public String getRelatedOderNo() {
        return this.relatedOderNo;
    }

    public ApplyInsuranceCbrfRequest setDestCountry(String destCountry) {
        this.destCountry = destCountry;
        return this;
    }
    public String getDestCountry() {
        return this.destCountry;
    }

    public ApplyInsuranceCbrfRequest setBusinessMerchantId(String businessMerchantId) {
        this.businessMerchantId = businessMerchantId;
        return this;
    }
    public String getBusinessMerchantId() {
        return this.businessMerchantId;
    }

    public ApplyInsuranceCbrfRequest setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
        return this;
    }
    public String getCollectionTime() {
        return this.collectionTime;
    }

    public ApplyInsuranceCbrfRequest setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }
    public String getGoodName() {
        return this.goodName;
    }

    public ApplyInsuranceCbrfRequest setGoodValue(String goodValue) {
        this.goodValue = goodValue;
        return this;
    }
    public String getGoodValue() {
        return this.goodValue;
    }

}
