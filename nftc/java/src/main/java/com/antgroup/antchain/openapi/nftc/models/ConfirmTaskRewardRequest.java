// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ConfirmTaskRewardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 鲸探用户唯一标识
    @NameInMap("open_user_id")
    @Validation(required = true)
    public String openUserId;

    // 前置通过消息获取的奖励流水唯—id(可用作幂等键，详情看下文的奖励消息通知)
    @NameInMap("reward_record_id")
    @Validation(required = true)
    public String rewardRecordId;

    public static ConfirmTaskRewardRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTaskRewardRequest self = new ConfirmTaskRewardRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmTaskRewardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmTaskRewardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmTaskRewardRequest setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
        return this;
    }
    public String getOpenUserId() {
        return this.openUserId;
    }

    public ConfirmTaskRewardRequest setRewardRecordId(String rewardRecordId) {
        this.rewardRecordId = rewardRecordId;
        return this;
    }
    public String getRewardRecordId() {
        return this.rewardRecordId;
    }

}
