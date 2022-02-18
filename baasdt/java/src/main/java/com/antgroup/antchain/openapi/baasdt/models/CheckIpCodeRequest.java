// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CheckIpCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 数字凭证的编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 扫码用户的ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 扫码用户的名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 扫码用户的手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 扫码用户的位置信息
    @NameInMap("gps")
    public String gps;

    // 用户头像地址
    @NameInMap("avatar")
    @Validation(required = true)
    public String avatar;

    public static CheckIpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIpCodeRequest self = new CheckIpCodeRequest();
        return TeaModel.build(map, self);
    }

    public CheckIpCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckIpCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckIpCodeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CheckIpCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckIpCodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckIpCodeRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CheckIpCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CheckIpCodeRequest setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

    public CheckIpCodeRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

}
