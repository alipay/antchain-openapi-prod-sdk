// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参考更新请求结构体
    @NameInMap("did_update_req")
    @Validation(required = true)
    public ThingsDidUpdateReq didUpdateReq;

    // 交易唯一ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static UpdateThingsdidDidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidDidRequest self = new UpdateThingsdidDidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateThingsdidDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateThingsdidDidRequest setDidUpdateReq(ThingsDidUpdateReq didUpdateReq) {
        this.didUpdateReq = didUpdateReq;
        return this;
    }
    public ThingsDidUpdateReq getDidUpdateReq() {
        return this.didUpdateReq;
    }

    public UpdateThingsdidDidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
