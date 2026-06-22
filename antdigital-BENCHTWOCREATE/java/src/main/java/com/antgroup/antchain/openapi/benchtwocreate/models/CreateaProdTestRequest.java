// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class CreateaProdTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 结构体字段
    @NameInMap("struct_params")
    public BenchtwocreateStructForA structParams;

    public static CreateaProdTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateaProdTestRequest self = new CreateaProdTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateaProdTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateaProdTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateaProdTestRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public CreateaProdTestRequest setStructParams(BenchtwocreateStructForA structParams) {
        this.structParams = structParams;
        return this;
    }
    public BenchtwocreateStructForA getStructParams() {
        return this.structParams;
    }

}
