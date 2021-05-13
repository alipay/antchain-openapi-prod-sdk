// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class AuthChannelUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // Channel名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 发起授权操作的账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 要授权的账户
    @NameInMap("target_user_did")
    @Validation(required = true)
    public String targetUserDid;

    // 要给用户分配读或写权限
    // READ,
    // WRITE;
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 授权有效期，为空时表示永久有效
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    public static AuthChannelUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthChannelUserRequest self = new AuthChannelUserRequest();
        return TeaModel.build(map, self);
    }

    public AuthChannelUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthChannelUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthChannelUserRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public AuthChannelUserRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public AuthChannelUserRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public AuthChannelUserRequest setTargetUserDid(String targetUserDid) {
        this.targetUserDid = targetUserDid;
        return this;
    }
    public String getTargetUserDid() {
        return this.targetUserDid;
    }

    public AuthChannelUserRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public AuthChannelUserRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

}
