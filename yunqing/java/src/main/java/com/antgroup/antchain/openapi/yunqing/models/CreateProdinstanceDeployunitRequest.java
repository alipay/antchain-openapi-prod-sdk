// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateProdinstanceDeployunitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境标识
    @NameInMap("env_id")
    public String envId;

    // 云游内产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 执行部署单元实例id
    @NameInMap("unit_id")
    @Validation(required = true)
    public String unitId;

    // 部署单元名称
    @NameInMap("unit_name")
    @Validation(required = true)
    public String unitName;

    // 单元ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 逻辑部署单元实例id
    @NameInMap("logical_instance_id")
    @Validation(required = true)
    public String logicalInstanceId;

    public static CreateProdinstanceDeployunitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProdinstanceDeployunitRequest self = new CreateProdinstanceDeployunitRequest();
        return TeaModel.build(map, self);
    }

    public CreateProdinstanceDeployunitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProdinstanceDeployunitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProdinstanceDeployunitRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateProdinstanceDeployunitRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateProdinstanceDeployunitRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public CreateProdinstanceDeployunitRequest setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }
    public String getUnitName() {
        return this.unitName;
    }

    public CreateProdinstanceDeployunitRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public CreateProdinstanceDeployunitRequest setLogicalInstanceId(String logicalInstanceId) {
        this.logicalInstanceId = logicalInstanceId;
        return this;
    }
    public String getLogicalInstanceId() {
        return this.logicalInstanceId;
    }

}
