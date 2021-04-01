// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDataauthorizationDataEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据ID
    @NameInMap("data_id")
    @Validation(required = true, maxLength = 100)
    public String dataId;

    public static QueryDataauthorizationDataEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataauthorizationDataEntityRequest self = new QueryDataauthorizationDataEntityRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataauthorizationDataEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataauthorizationDataEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataauthorizationDataEntityRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
