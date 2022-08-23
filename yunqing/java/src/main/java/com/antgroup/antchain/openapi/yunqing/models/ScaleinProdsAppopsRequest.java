// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ScaleinProdsAppopsRequest extends TeaModel {
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
    @Validation(required = true)
    public String deploymentUnitIdentity;

    // 部署单元实例id
    @NameInMap("deployment_unit_instance_identity")
    @Validation(required = true)
    public String deploymentUnitInstanceIdentity;

    // 应用期望副本数
    @NameInMap("expect_replica")
    @Validation(required = true)
    public Long expectReplica;

    public static ScaleinProdsAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleinProdsAppopsRequest self = new ScaleinProdsAppopsRequest();
        return TeaModel.build(map, self);
    }

    public ScaleinProdsAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleinProdsAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ScaleinProdsAppopsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ScaleinProdsAppopsRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ScaleinProdsAppopsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ScaleinProdsAppopsRequest setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public ScaleinProdsAppopsRequest setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

    public ScaleinProdsAppopsRequest setExpectReplica(Long expectReplica) {
        this.expectReplica = expectReplica;
        return this;
    }
    public Long getExpectReplica() {
        return this.expectReplica;
    }

}
