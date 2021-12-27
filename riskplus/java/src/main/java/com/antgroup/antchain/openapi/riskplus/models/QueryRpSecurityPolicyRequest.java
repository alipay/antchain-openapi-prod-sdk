// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRpSecurityPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 风险类型：表示风险处理或风险咨询——process/advice
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    // security_scene
    @NameInMap("security_scene")
    @Validation(required = true)
    public SecurityScene securityScene;

    // service_context
    @NameInMap("service_context")
    @Validation(required = true)
    public ServiceContext serviceContext;

    public static QueryRpSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRpSecurityPolicyRequest self = new QueryRpSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryRpSecurityPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRpSecurityPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRpSecurityPolicyRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public QueryRpSecurityPolicyRequest setSecurityScene(SecurityScene securityScene) {
        this.securityScene = securityScene;
        return this;
    }
    public SecurityScene getSecurityScene() {
        return this.securityScene;
    }

    public QueryRpSecurityPolicyRequest setServiceContext(ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
        return this;
    }
    public ServiceContext getServiceContext() {
        return this.serviceContext;
    }

}
