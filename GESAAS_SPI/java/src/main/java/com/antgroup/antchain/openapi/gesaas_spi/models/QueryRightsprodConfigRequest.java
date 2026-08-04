// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class QueryRightsprodConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权益供应商供应权益编码
    @NameInMap("supply_rights_code")
    @Validation(required = true)
    public String supplyRightsCode;

    public static QueryRightsprodConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodConfigRequest self = new QueryRightsprodConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRightsprodConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRightsprodConfigRequest setSupplyRightsCode(String supplyRightsCode) {
        this.supplyRightsCode = supplyRightsCode;
        return this;
    }
    public String getSupplyRightsCode() {
        return this.supplyRightsCode;
    }

}
