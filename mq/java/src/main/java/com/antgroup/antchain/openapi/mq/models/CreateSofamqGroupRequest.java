// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqGroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建的消息端 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需创建的 Group ID 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // Group ID 描述信息
    @NameInMap("remark")
    public String remark;

    // 指定创建的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
    // 
    // tcp：默认值，表示创建的 Group ID 仅适用于 TCP 协议的消息收发。
    // http：表示创建的 Group ID 仅适用于 HTTP 协议的消息收发。
    @NameInMap("group_type")
    public String groupType;

    // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
    @NameInMap("owner")
    public String owner;

    public static CreateSofamqGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqGroupRequest self = new CreateSofamqGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqGroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateSofamqGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSofamqGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateSofamqGroupRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
