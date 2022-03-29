// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SubscriptionGroupDTO extends TeaModel {
    // 消费者所属消费组
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 部署模型
    @NameInMap("message_model")
    @Validation(required = true)
    public String messageModel;

    // 订阅字符串
    @NameInMap("sub_string")
    @Validation(required = true)
    public String subString;

    // group协议类型
    @NameInMap("group_type")
    @Validation(required = true)
    public String groupType;

    public static SubscriptionGroupDTO build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionGroupDTO self = new SubscriptionGroupDTO();
        return TeaModel.build(map, self);
    }

    public SubscriptionGroupDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SubscriptionGroupDTO setMessageModel(String messageModel) {
        this.messageModel = messageModel;
        return this;
    }
    public String getMessageModel() {
        return this.messageModel;
    }

    public SubscriptionGroupDTO setSubString(String subString) {
        this.subString = subString;
        return this;
    }
    public String getSubString() {
        return this.subString;
    }

    public SubscriptionGroupDTO setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

}
