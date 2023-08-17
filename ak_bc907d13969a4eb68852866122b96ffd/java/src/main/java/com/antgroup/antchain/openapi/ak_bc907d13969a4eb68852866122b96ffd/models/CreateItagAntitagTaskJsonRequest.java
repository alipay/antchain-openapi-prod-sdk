// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class CreateItagAntitagTaskJsonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建任务参数，格式为JSON
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static CreateItagAntitagTaskJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateItagAntitagTaskJsonRequest self = new CreateItagAntitagTaskJsonRequest();
        return TeaModel.build(map, self);
    }

    public CreateItagAntitagTaskJsonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateItagAntitagTaskJsonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateItagAntitagTaskJsonRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
