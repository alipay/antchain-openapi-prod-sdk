// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ListProdinstanceDeployunitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    // 产品码。
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 单元ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    public static ListProdinstanceDeployunitRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProdinstanceDeployunitRequest self = new ListProdinstanceDeployunitRequest();
        return TeaModel.build(map, self);
    }

    public ListProdinstanceDeployunitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListProdinstanceDeployunitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListProdinstanceDeployunitRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ListProdinstanceDeployunitRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListProdinstanceDeployunitRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
