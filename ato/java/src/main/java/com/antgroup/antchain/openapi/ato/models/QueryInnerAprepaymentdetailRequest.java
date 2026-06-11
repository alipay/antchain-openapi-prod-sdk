// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerAprepaymentdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户ID
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资产包ID
    @NameInMap("asset_packet_id")
    @Validation(required = true)
    public String assetPacketId;

    // 链路追踪ID
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryInnerAprepaymentdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAprepaymentdetailRequest self = new QueryInnerAprepaymentdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerAprepaymentdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerAprepaymentdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerAprepaymentdetailRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public QueryInnerAprepaymentdetailRequest setAssetPacketId(String assetPacketId) {
        this.assetPacketId = assetPacketId;
        return this;
    }
    public String getAssetPacketId() {
        return this.assetPacketId;
    }

    public QueryInnerAprepaymentdetailRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
