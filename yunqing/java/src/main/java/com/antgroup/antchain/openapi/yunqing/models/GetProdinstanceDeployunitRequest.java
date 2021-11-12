// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetProdinstanceDeployunitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 单元ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 环境唯一标识
    @NameInMap("env_id")
    public String envId;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 用户传入部署单元标识
    @NameInMap("unit_id")
    public String unitId;

    // 单元实例ID
    @NameInMap("unit_instance_id")
    @Validation(required = true)
    public String unitInstanceId;

    public static GetProdinstanceDeployunitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProdinstanceDeployunitRequest self = new GetProdinstanceDeployunitRequest();
        return TeaModel.build(map, self);
    }

    public GetProdinstanceDeployunitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetProdinstanceDeployunitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetProdinstanceDeployunitRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public GetProdinstanceDeployunitRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetProdinstanceDeployunitRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetProdinstanceDeployunitRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public GetProdinstanceDeployunitRequest setUnitInstanceId(String unitInstanceId) {
        this.unitInstanceId = unitInstanceId;
        return this;
    }
    public String getUnitInstanceId() {
        return this.unitInstanceId;
    }

}
