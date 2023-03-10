// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateIpCodebaseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // phone_number、user_id 必填一个
    @NameInMap("user_id")
    public String userId;

    // phone_number、user_id 必填一个
    @NameInMap("phone_number")
    public String phoneNumber;

    // 用户头像地址，传空则查询shareInfo并更新
    @NameInMap("avatar")
    public String avatar;

    // 用户昵称，传空则查询shareInfo并更新
    @NameInMap("nick_name")
    public String nickName;

    public static UpdateIpCodebaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpCodebaseinfoRequest self = new UpdateIpCodebaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpCodebaseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIpCodebaseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIpCodebaseinfoRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateIpCodebaseinfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateIpCodebaseinfoRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateIpCodebaseinfoRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdateIpCodebaseinfoRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

}
