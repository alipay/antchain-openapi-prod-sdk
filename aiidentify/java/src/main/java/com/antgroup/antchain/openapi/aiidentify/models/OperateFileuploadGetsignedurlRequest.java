// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class OperateFileuploadGetsignedurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static OperateFileuploadGetsignedurlRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateFileuploadGetsignedurlRequest self = new OperateFileuploadGetsignedurlRequest();
        return TeaModel.build(map, self);
    }

    public OperateFileuploadGetsignedurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateFileuploadGetsignedurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
