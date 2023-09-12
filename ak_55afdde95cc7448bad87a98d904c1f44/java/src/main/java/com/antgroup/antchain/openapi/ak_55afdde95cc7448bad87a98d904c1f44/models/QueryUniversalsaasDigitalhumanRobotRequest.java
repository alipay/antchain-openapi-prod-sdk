// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_55afdde95cc7448bad87a98d904c1f44.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanRobotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // targetMethod；数字人目标方法调用
    @NameInMap("target_method")
    @Validation(required = true)
    public String targetMethod;

    // 	
    // 租户code&租户id，对于子部门客户需要上传子部门id
    @NameInMap("tenant_code")
    public String tenantCode;

    // method_params:对应target_method请求方法的具体传参值k-v map
    @NameInMap("method_params")
    public String methodParams;

    public static QueryUniversalsaasDigitalhumanRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanRobotRequest self = new QueryUniversalsaasDigitalhumanRobotRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanRobotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUniversalsaasDigitalhumanRobotRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUniversalsaasDigitalhumanRobotRequest setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
        return this;
    }
    public String getTargetMethod() {
        return this.targetMethod;
    }

    public QueryUniversalsaasDigitalhumanRobotRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public QueryUniversalsaasDigitalhumanRobotRequest setMethodParams(String methodParams) {
        this.methodParams = methodParams;
        return this;
    }
    public String getMethodParams() {
        return this.methodParams;
    }

}
