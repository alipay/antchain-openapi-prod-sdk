// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CancelChannelUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    // 发起方账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 要取消授权的账户
    @NameInMap("target_user_did")
    @Validation(required = true)
    public String targetUserDid;

    // 要取消的操作权限类型
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    public static CancelChannelUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelChannelUserRequest self = new CancelChannelUserRequest();
        return TeaModel.build(map, self);
    }

    public CancelChannelUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelChannelUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelChannelUserRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CancelChannelUserRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CancelChannelUserRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CancelChannelUserRequest setTargetUserDid(String targetUserDid) {
        this.targetUserDid = targetUserDid;
        return this;
    }
    public String getTargetUserDid() {
        return this.targetUserDid;
    }

    public CancelChannelUserRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
