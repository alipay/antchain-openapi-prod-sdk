// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateProdsAppopsRequest extends TeaModel {
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

    // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启	
    // 
    @NameInMap("ops_action")
    @Validation(required = true)
    public String opsAction;

    // 容器名称列表	
    // 
    @NameInMap("container_names")
    @Validation(required = true)
    public java.util.List<String> containerNames;

    // 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
    @NameInMap("group_strategy")
    @Validation(required = true)
    public String groupStrategy;

    public static CreateProdsAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProdsAppopsRequest self = new CreateProdsAppopsRequest();
        return TeaModel.build(map, self);
    }

    public CreateProdsAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProdsAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProdsAppopsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateProdsAppopsRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateProdsAppopsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateProdsAppopsRequest setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public CreateProdsAppopsRequest setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

    public CreateProdsAppopsRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public CreateProdsAppopsRequest setContainerNames(java.util.List<String> containerNames) {
        this.containerNames = containerNames;
        return this;
    }
    public java.util.List<String> getContainerNames() {
        return this.containerNames;
    }

    public CreateProdsAppopsRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

}
