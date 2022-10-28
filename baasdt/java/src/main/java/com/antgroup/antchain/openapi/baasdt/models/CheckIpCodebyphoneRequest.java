// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CheckIpCodebyphoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 支持数字凭证的加密编码及UNI序列号
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 核验用户的手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 核验用户的名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 外部客户自定义客户ID
    @NameInMap("external_user_id")
    public String externalUserId;

    // 核验用户的位置信息
    @NameInMap("gps")
    public String gps;

    // 核验用户头像地址
    @NameInMap("avatar")
    public String avatar;

    public static CheckIpCodebyphoneRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIpCodebyphoneRequest self = new CheckIpCodebyphoneRequest();
        return TeaModel.build(map, self);
    }

    public CheckIpCodebyphoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckIpCodebyphoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckIpCodebyphoneRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CheckIpCodebyphoneRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckIpCodebyphoneRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CheckIpCodebyphoneRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CheckIpCodebyphoneRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public CheckIpCodebyphoneRequest setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

    public CheckIpCodebyphoneRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

}
