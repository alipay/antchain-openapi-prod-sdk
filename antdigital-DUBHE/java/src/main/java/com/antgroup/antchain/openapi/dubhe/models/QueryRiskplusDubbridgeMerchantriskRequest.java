// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeMerchantriskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请单号
    @NameInMap("apply_no")
    @Validation(required = true)
    public String applyNo;

    // 渠道租户
    @NameInMap("channel_tenant")
    @Validation(required = true)
    public String channelTenant;

    // 来源类型
    @NameInMap("source_type")
    public String sourceType;

    public static QueryRiskplusDubbridgeMerchantriskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeMerchantriskRequest self = new QueryRiskplusDubbridgeMerchantriskRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeMerchantriskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgeMerchantriskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgeMerchantriskRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public QueryRiskplusDubbridgeMerchantriskRequest setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

    public QueryRiskplusDubbridgeMerchantriskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
