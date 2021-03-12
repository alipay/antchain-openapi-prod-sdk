// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartVcVcrepoControlleradduserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // controller did标示
    @NameInMap("controller")
    @Validation(required = true)
    public String controller;

    // 操作缩写
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 实际参数
    @NameInMap("payload")
    @Validation(required = true)
    public VcControllerAddUserRegisterPayload payload;

    // controller使用私钥对参数进行签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static StartVcVcrepoControlleradduserRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVcVcrepoControlleradduserRequest self = new StartVcVcrepoControlleradduserRequest();
        return TeaModel.build(map, self);
    }

    public StartVcVcrepoControlleradduserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartVcVcrepoControlleradduserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartVcVcrepoControlleradduserRequest setController(String controller) {
        this.controller = controller;
        return this;
    }
    public String getController() {
        return this.controller;
    }

    public StartVcVcrepoControlleradduserRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public StartVcVcrepoControlleradduserRequest setPayload(VcControllerAddUserRegisterPayload payload) {
        this.payload = payload;
        return this;
    }
    public VcControllerAddUserRegisterPayload getPayload() {
        return this.payload;
    }

    public StartVcVcrepoControlleradduserRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
