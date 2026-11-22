// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ResetArkassetgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {"Id":"group-20240514212750-b5e9m","Name":"demo-portrait-group-renamed","Description":"更新后的虚拟人像素材组描述","ProjectName":"default"}
    @NameInMap("request_body")
    @Validation(required = true)
    public String requestBody;

    public static ResetArkassetgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetArkassetgroupRequest self = new ResetArkassetgroupRequest();
        return TeaModel.build(map, self);
    }

    public ResetArkassetgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetArkassetgroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetArkassetgroupRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

}
