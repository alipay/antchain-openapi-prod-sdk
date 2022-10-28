// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ReceiveIpCodebyphoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 数字凭证加密编码或UNI序列号
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 领取用户的名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 领取用户的手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 外部客户自定义客户ID
    @NameInMap("external_user_id")
    public String externalUserId;

    // 是否空投
    @NameInMap("launch_en")
    @Validation(required = true)
    public Boolean launchEn;

    // 备注
    @NameInMap("memo")
    public String memo;

    // 领取用户的位置信息
    @NameInMap("gps")
    public String gps;

    // 用户头像地址
    @NameInMap("avatar")
    public String avatar;

    public static ReceiveIpCodebyphoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveIpCodebyphoneRequest self = new ReceiveIpCodebyphoneRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveIpCodebyphoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveIpCodebyphoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReceiveIpCodebyphoneRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ReceiveIpCodebyphoneRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReceiveIpCodebyphoneRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ReceiveIpCodebyphoneRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ReceiveIpCodebyphoneRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ReceiveIpCodebyphoneRequest setLaunchEn(Boolean launchEn) {
        this.launchEn = launchEn;
        return this;
    }
    public Boolean getLaunchEn() {
        return this.launchEn;
    }

    public ReceiveIpCodebyphoneRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ReceiveIpCodebyphoneRequest setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

    public ReceiveIpCodebyphoneRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

}
