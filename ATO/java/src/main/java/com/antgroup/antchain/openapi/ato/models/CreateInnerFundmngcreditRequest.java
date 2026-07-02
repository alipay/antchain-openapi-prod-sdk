// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerFundmngcreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 订单号类型，ORDER_NO(订单id)或PACKAGE_ID(资产包id)
    @NameInMap("order_no_type")
    @Validation(required = true)
    public String orderNoType;

    // 订单id或资产包id
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 资产凭证名称
    @NameInMap("credit_name")
    @Validation(required = true)
    public String creditName;

    // 上传文件返回的fileKey，当content_type=FILE时必填
    @NameInMap("credit_file_key")
    public String creditFileKey;

    // 文本内容，JSON_TEXT类型需传入JSON文本;TEXT类型则需传入普通文本
    @NameInMap("credit_content")
    public String creditContent;

    // 页面调用traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static CreateInnerFundmngcreditRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerFundmngcreditRequest self = new CreateInnerFundmngcreditRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerFundmngcreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerFundmngcreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerFundmngcreditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerFundmngcreditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateInnerFundmngcreditRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public CreateInnerFundmngcreditRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public CreateInnerFundmngcreditRequest setOrderNoType(String orderNoType) {
        this.orderNoType = orderNoType;
        return this;
    }
    public String getOrderNoType() {
        return this.orderNoType;
    }

    public CreateInnerFundmngcreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateInnerFundmngcreditRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateInnerFundmngcreditRequest setCreditName(String creditName) {
        this.creditName = creditName;
        return this;
    }
    public String getCreditName() {
        return this.creditName;
    }

    public CreateInnerFundmngcreditRequest setCreditFileKey(String creditFileKey) {
        this.creditFileKey = creditFileKey;
        return this;
    }
    public String getCreditFileKey() {
        return this.creditFileKey;
    }

    public CreateInnerFundmngcreditRequest setCreditContent(String creditContent) {
        this.creditContent = creditContent;
        return this;
    }
    public String getCreditContent() {
        return this.creditContent;
    }

    public CreateInnerFundmngcreditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
