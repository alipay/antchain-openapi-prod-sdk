// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarScopemissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static DescribeAcarScopemissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarScopemissionRequest self = new DescribeAcarScopemissionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAcarScopemissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeAcarScopemissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
