// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryMcpAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 板块名称
    @NameInMap("plate_object")
    @Validation(required = true)
    public String plateObject;

    public static QueryMcpAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMcpAssetRequest self = new QueryMcpAssetRequest();
        return TeaModel.build(map, self);
    }

    public QueryMcpAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMcpAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMcpAssetRequest setPlateObject(String plateObject) {
        this.plateObject = plateObject;
        return this;
    }
    public String getPlateObject() {
        return this.plateObject;
    }

}
