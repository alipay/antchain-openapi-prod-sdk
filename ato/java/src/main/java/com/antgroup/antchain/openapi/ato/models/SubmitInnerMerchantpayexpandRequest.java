// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerMerchantpayexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 进件id
    @NameInMap("pay_expand_id")
    @Validation(required = true)
    public String payExpandId;

    // 操作人名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // traceId
    @NameInMap("trace_id")
    public String traceId;

    public static SubmitInnerMerchantpayexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerMerchantpayexpandRequest self = new SubmitInnerMerchantpayexpandRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerMerchantpayexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerMerchantpayexpandRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerMerchantpayexpandRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerMerchantpayexpandRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public SubmitInnerMerchantpayexpandRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SubmitInnerMerchantpayexpandRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
