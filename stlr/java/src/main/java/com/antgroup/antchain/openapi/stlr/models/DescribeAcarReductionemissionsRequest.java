// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarReductionemissionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static DescribeAcarReductionemissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarReductionemissionsRequest self = new DescribeAcarReductionemissionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAcarReductionemissionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeAcarReductionemissionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
