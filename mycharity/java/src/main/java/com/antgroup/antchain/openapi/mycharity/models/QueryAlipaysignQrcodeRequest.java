// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class QueryAlipaysignQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryAlipaysignQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlipaysignQrcodeRequest self = new QueryAlipaysignQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlipaysignQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlipaysignQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
