// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GroupSubDetailDTO extends TeaModel {
    // Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 部署模型
    @NameInMap("message_model")
    @Validation(required = true)
    public String messageModel;

    // 是否在线
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 订阅信息列表
    @NameInMap("subscription_data_list")
    @Validation(required = true)
    public java.util.List<SubscriptionTopicDTO> subscriptionDataList;

    public static GroupSubDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        GroupSubDetailDTO self = new GroupSubDetailDTO();
        return TeaModel.build(map, self);
    }

    public GroupSubDetailDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GroupSubDetailDTO setMessageModel(String messageModel) {
        this.messageModel = messageModel;
        return this;
    }
    public String getMessageModel() {
        return this.messageModel;
    }

    public GroupSubDetailDTO setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public GroupSubDetailDTO setSubscriptionDataList(java.util.List<SubscriptionTopicDTO> subscriptionDataList) {
        this.subscriptionDataList = subscriptionDataList;
        return this;
    }
    public java.util.List<SubscriptionTopicDTO> getSubscriptionDataList() {
        return this.subscriptionDataList;
    }

}
