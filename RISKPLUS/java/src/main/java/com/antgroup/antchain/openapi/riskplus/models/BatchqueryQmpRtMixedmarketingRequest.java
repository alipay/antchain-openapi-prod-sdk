// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryQmpRtMixedmarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 圈客计划code列表
    @NameInMap("plan_codes")
    @Validation(required = true)
    public java.util.List<String> planCodes;

    // 计划集合code，对标圈客计划code列表，一般不可变
    @NameInMap("plan_set_code")
    public String planSetCode;

    // 查询协议模版
    @NameInMap("query_template")
    @Validation(required = true)
    public String queryTemplate;

    // 客群凭证和其他信息
    @NameInMap("customer_details")
    @Validation(required = true)
    public java.util.List<CustomerInfo> customerDetails;

    // 客群共用参数
    @NameInMap("public_properties")
    public String publicProperties;

    // 外部业务流水号
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    public static BatchqueryQmpRtMixedmarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryQmpRtMixedmarketingRequest self = new BatchqueryQmpRtMixedmarketingRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryQmpRtMixedmarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryQmpRtMixedmarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryQmpRtMixedmarketingRequest setPlanCodes(java.util.List<String> planCodes) {
        this.planCodes = planCodes;
        return this;
    }
    public java.util.List<String> getPlanCodes() {
        return this.planCodes;
    }

    public BatchqueryQmpRtMixedmarketingRequest setPlanSetCode(String planSetCode) {
        this.planSetCode = planSetCode;
        return this;
    }
    public String getPlanSetCode() {
        return this.planSetCode;
    }

    public BatchqueryQmpRtMixedmarketingRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public BatchqueryQmpRtMixedmarketingRequest setCustomerDetails(java.util.List<CustomerInfo> customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public java.util.List<CustomerInfo> getCustomerDetails() {
        return this.customerDetails;
    }

    public BatchqueryQmpRtMixedmarketingRequest setPublicProperties(String publicProperties) {
        this.publicProperties = publicProperties;
        return this;
    }
    public String getPublicProperties() {
        return this.publicProperties;
    }

    public BatchqueryQmpRtMixedmarketingRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

}
