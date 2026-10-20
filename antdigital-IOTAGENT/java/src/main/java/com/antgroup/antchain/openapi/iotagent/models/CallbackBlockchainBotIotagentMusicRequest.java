// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class CallbackBlockchainBotIotagentMusicRequest extends TeaModel {
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

    public static CallbackBlockchainBotIotagentMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackBlockchainBotIotagentMusicRequest self = new CallbackBlockchainBotIotagentMusicRequest();
        return TeaModel.build(map, self);
    }

    public CallbackBlockchainBotIotagentMusicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackBlockchainBotIotagentMusicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackBlockchainBotIotagentMusicRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallbackBlockchainBotIotagentMusicRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
