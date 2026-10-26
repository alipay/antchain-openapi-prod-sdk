// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CallbackIotagentMusicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云音乐授权码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 云音乐CSRF状态码
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static CallbackIotagentMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackIotagentMusicRequest self = new CallbackIotagentMusicRequest();
        return TeaModel.build(map, self);
    }

    public CallbackIotagentMusicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackIotagentMusicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackIotagentMusicRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallbackIotagentMusicRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
