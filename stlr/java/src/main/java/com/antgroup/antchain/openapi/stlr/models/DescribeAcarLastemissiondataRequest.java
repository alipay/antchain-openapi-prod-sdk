// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarLastemissiondataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static DescribeAcarLastemissiondataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarLastemissiondataRequest self = new DescribeAcarLastemissiondataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAcarLastemissiondataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeAcarLastemissiondataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
