// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryResourceinstancesContainersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 部署单元标识id
    @NameInMap("deployment_unit_identity")
    public String deploymentUnitIdentity;

    // 部署单元实例标识id
    @NameInMap("deployment_unit_instance_identity")
    public String deploymentUnitInstanceIdentity;

    public static PagequeryResourceinstancesContainersRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryResourceinstancesContainersRequest self = new PagequeryResourceinstancesContainersRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryResourceinstancesContainersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryResourceinstancesContainersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryResourceinstancesContainersRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public PagequeryResourceinstancesContainersRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public PagequeryResourceinstancesContainersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PagequeryResourceinstancesContainersRequest setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public PagequeryResourceinstancesContainersRequest setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

}
