// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ReceiveIpCodeRequest extends TeaModel {
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

    // 领取用户的ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 领取用户的名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 领取用户的手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 领取用户的位置信息
    @NameInMap("gps")
    public String gps;

    // 用户头像地址
    @NameInMap("avatar")
    @Validation(required = true)
    public String avatar;

    // true 发起流转，false 正常领取，默认false
    @NameInMap("flow_en")
    public Boolean flowEn;

    // 交易单ID（流转订单）、支付宝交易号、交易金额、流转交易平台、平台logo、原持有人ID 等信息，由调用方构造
    @NameInMap("ext_info")
    public String extInfo;

    public static ReceiveIpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveIpCodeRequest self = new ReceiveIpCodeRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveIpCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveIpCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReceiveIpCodeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ReceiveIpCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReceiveIpCodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ReceiveIpCodeRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ReceiveIpCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ReceiveIpCodeRequest setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

    public ReceiveIpCodeRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public ReceiveIpCodeRequest setFlowEn(Boolean flowEn) {
        this.flowEn = flowEn;
        return this;
    }
    public Boolean getFlowEn() {
        return this.flowEn;
    }

    public ReceiveIpCodeRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
