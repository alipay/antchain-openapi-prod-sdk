// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateProdinstanceDeployunitbatchRequest extends TeaModel {
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

    // 部署单元名称
    @NameInMap("deployment_unit_name")
    @Validation(required = true)
    public String deploymentUnitName;

    // 部署单元实例id列表
    @NameInMap("unit_instance_ids")
    @Validation(required = true)
    public java.util.List<String> unitInstanceIds;

    // 逻辑部署单元实例id
    @NameInMap("logical_instance_id")
    @Validation(required = true)
    public String logicalInstanceId;

    // 集群中哪个zone，公有云场景使用，专有云不需要部署
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    public static CreateProdinstanceDeployunitbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProdinstanceDeployunitbatchRequest self = new CreateProdinstanceDeployunitbatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateProdinstanceDeployunitbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProdinstanceDeployunitbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProdinstanceDeployunitbatchRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateProdinstanceDeployunitbatchRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateProdinstanceDeployunitbatchRequest setDeploymentUnitName(String deploymentUnitName) {
        this.deploymentUnitName = deploymentUnitName;
        return this;
    }
    public String getDeploymentUnitName() {
        return this.deploymentUnitName;
    }

    public CreateProdinstanceDeployunitbatchRequest setUnitInstanceIds(java.util.List<String> unitInstanceIds) {
        this.unitInstanceIds = unitInstanceIds;
        return this;
    }
    public java.util.List<String> getUnitInstanceIds() {
        return this.unitInstanceIds;
    }

    public CreateProdinstanceDeployunitbatchRequest setLogicalInstanceId(String logicalInstanceId) {
        this.logicalInstanceId = logicalInstanceId;
        return this;
    }
    public String getLogicalInstanceId() {
        return this.logicalInstanceId;
    }

    public CreateProdinstanceDeployunitbatchRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
