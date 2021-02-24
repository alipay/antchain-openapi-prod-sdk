// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QuerySecurityPolicyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 风险类型：表示风险处理或风险咨询——process/advice
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    @NameInMap("security_scene")
    @Validation(required = true)
    public SecurityScene securityScene;

    @NameInMap("service_context")
    @Validation(required = true)
    public ServiceContext serviceContext;

    public static QuerySecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityPolicyRequest self = new QuerySecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityPolicyRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public QuerySecurityPolicyRequest setSecurityScene(SecurityScene securityScene) {
        this.securityScene = securityScene;
        return this;
    }
    public SecurityScene getSecurityScene() {
        return this.securityScene;
    }

    public QuerySecurityPolicyRequest setServiceContext(ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
        return this;
    }
    public ServiceContext getServiceContext() {
        return this.serviceContext;
    }

}
