// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QuerySecurityAiriskcloudPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 风险类型：表示风险处理或风险咨询——process/advice
    @NameInMap("risk_type")
    public String riskType;

    // 事件业务属性
    @NameInMap("event_info")
    @Validation(required = true)
    public String eventInfo;

    // 风险场景信息
    @NameInMap("security_scene")
    public SecurityScene securityScene;

    // 服务上下文
    @NameInMap("service_context")
    public ServiceContext serviceContext;

    public static QuerySecurityAiriskcloudPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityAiriskcloudPolicyRequest self = new QuerySecurityAiriskcloudPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityAiriskcloudPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityAiriskcloudPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityAiriskcloudPolicyRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public QuerySecurityAiriskcloudPolicyRequest setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public String getEventInfo() {
        return this.eventInfo;
    }

    public QuerySecurityAiriskcloudPolicyRequest setSecurityScene(SecurityScene securityScene) {
        this.securityScene = securityScene;
        return this;
    }
    public SecurityScene getSecurityScene() {
        return this.securityScene;
    }

    public QuerySecurityAiriskcloudPolicyRequest setServiceContext(ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
        return this;
    }
    public ServiceContext getServiceContext() {
        return this.serviceContext;
    }

}
