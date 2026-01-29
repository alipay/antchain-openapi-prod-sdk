// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMerchantpayexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
    @NameInMap("pay_expand_id")
    public String payExpandId;

    // 进件模式 DIRECT(直连进件) AGENT(代理进件)
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    // traceId
    @NameInMap("trace_id")
    public String traceId;

    public static QueryInnerMerchantpayexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMerchantpayexpandRequest self = new QueryInnerMerchantpayexpandRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerMerchantpayexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerMerchantpayexpandRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerMerchantpayexpandRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerMerchantpayexpandRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public QueryInnerMerchantpayexpandRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public QueryInnerMerchantpayexpandRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
