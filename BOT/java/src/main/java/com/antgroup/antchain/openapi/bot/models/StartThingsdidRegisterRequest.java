// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartThingsdidRegisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信物链交易唯一ID，代表需要标识的操作ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 注册信物链身份实体请求结构体
    @NameInMap("register_req")
    @Validation(required = true)
    public ThingsDidRegisterReq registerReq;

    public static StartThingsdidRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartThingsdidRegisterRequest self = new StartThingsdidRegisterRequest();
        return TeaModel.build(map, self);
    }

    public StartThingsdidRegisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartThingsdidRegisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartThingsdidRegisterRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public StartThingsdidRegisterRequest setRegisterReq(ThingsDidRegisterReq registerReq) {
        this.registerReq = registerReq;
        return this;
    }
    public ThingsDidRegisterReq getRegisterReq() {
        return this.registerReq;
    }

}
