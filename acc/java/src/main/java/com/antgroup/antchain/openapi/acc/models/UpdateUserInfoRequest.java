// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class UpdateUserInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云蚂侧用户id
    // 
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 信息同步类型
    // 
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 用户邮箱
    // 
    @NameInMap("email")
    public String email;

    // 用户手机号码
    // 
    @NameInMap("telphone")
    public String telphone;

    // 个人认证状态
    // 
    @NameInMap("user_cert_status")
    public String userCertStatus;

    // 个人认证did
    // 
    @NameInMap("user_did")
    public String userDid;

    public static UpdateUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInfoRequest self = new UpdateUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUserInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateUserInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UpdateUserInfoRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public UpdateUserInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserInfoRequest setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }
    public String getTelphone() {
        return this.telphone;
    }

    public UpdateUserInfoRequest setUserCertStatus(String userCertStatus) {
        this.userCertStatus = userCertStatus;
        return this;
    }
    public String getUserCertStatus() {
        return this.userCertStatus;
    }

    public UpdateUserInfoRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
