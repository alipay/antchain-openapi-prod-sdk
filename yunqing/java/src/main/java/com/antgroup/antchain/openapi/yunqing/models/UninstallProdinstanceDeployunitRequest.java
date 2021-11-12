// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class UninstallProdinstanceDeployunitRequest extends TeaModel {
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
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 单元实例ID
    @NameInMap("unit_instance_id")
    @Validation(required = true)
    public String unitInstanceId;

    public static UninstallProdinstanceDeployunitRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallProdinstanceDeployunitRequest self = new UninstallProdinstanceDeployunitRequest();
        return TeaModel.build(map, self);
    }

    public UninstallProdinstanceDeployunitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UninstallProdinstanceDeployunitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UninstallProdinstanceDeployunitRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public UninstallProdinstanceDeployunitRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public UninstallProdinstanceDeployunitRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UninstallProdinstanceDeployunitRequest setUnitInstanceId(String unitInstanceId) {
        this.unitInstanceId = unitInstanceId;
        return this;
    }
    public String getUnitInstanceId() {
        return this.unitInstanceId;
    }

}
