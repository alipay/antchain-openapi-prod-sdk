// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtTailmarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 营销计划id
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // 	
    // 用户列表传输模版
    @NameInMap("query_template")
    @Validation(required = true)
    public String queryTemplate;

    // 	
    // 用户查询凭证列表
    @NameInMap("customer_keys")
    @Validation(required = true)
    public java.util.List<String> customerKeys;

    // 业务方流水号
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    public static BatchqueryUmktRtTailmarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtTailmarketingRequest self = new BatchqueryUmktRtTailmarketingRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtTailmarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktRtTailmarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktRtTailmarketingRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public BatchqueryUmktRtTailmarketingRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public BatchqueryUmktRtTailmarketingRequest setCustomerKeys(java.util.List<String> customerKeys) {
        this.customerKeys = customerKeys;
        return this;
    }
    public java.util.List<String> getCustomerKeys() {
        return this.customerKeys;
    }

    public BatchqueryUmktRtTailmarketingRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

}
