// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateReceivableBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试
    @NameInMap("test")
    public AuthParty test;

    // 的撒
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static CreateReceivableBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReceivableBillRequest self = new CreateReceivableBillRequest();
        return TeaModel.build(map, self);
    }

    public CreateReceivableBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateReceivableBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateReceivableBillRequest setTest(AuthParty test) {
        this.test = test;
        return this;
    }
    public AuthParty getTest() {
        return this.test;
    }

    public CreateReceivableBillRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
