// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetUnitDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境标识
    @NameInMap("env_id")
    public String envId;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 单元实例标识
    @NameInMap("unit_instance_identity")
    @Validation(required = true)
    public String unitInstanceIdentity;

    // 单元ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    public static GetUnitDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnitDetailRequest self = new GetUnitDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetUnitDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnitDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetUnitDetailRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetUnitDetailRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetUnitDetailRequest setUnitInstanceIdentity(String unitInstanceIdentity) {
        this.unitInstanceIdentity = unitInstanceIdentity;
        return this;
    }
    public String getUnitInstanceIdentity() {
        return this.unitInstanceIdentity;
    }

    public GetUnitDetailRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
