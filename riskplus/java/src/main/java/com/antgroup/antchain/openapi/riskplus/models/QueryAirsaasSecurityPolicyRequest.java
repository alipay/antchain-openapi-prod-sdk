// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryAirsaasSecurityPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 风控时间咨询查询入参
    @NameInMap("event_info")
    @Validation(required = true)
    public EventInfo eventInfo;

    // 请求处理方式
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    public static QueryAirsaasSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAirsaasSecurityPolicyRequest self = new QueryAirsaasSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryAirsaasSecurityPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAirsaasSecurityPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAirsaasSecurityPolicyRequest setEventInfo(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public EventInfo getEventInfo() {
        return this.eventInfo;
    }

    public QueryAirsaasSecurityPolicyRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

}
