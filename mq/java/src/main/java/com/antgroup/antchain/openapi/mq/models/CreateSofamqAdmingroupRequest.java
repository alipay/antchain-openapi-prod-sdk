// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqAdmingroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群名
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // group协议类型
    @NameInMap("group_type")
    public String groupType;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // Group ID 描述信息
    @NameInMap("remark")
    public String remark;

    // 生效范围，三板斧使用
    @NameInMap("scope")
    public String scope;

    // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
    @NameInMap("owner")
    public String owner;

    public static CreateSofamqAdmingroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqAdmingroupRequest self = new CreateSofamqAdmingroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqAdmingroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqAdmingroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqAdmingroupRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateSofamqAdmingroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateSofamqAdmingroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateSofamqAdmingroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqAdmingroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSofamqAdmingroupRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateSofamqAdmingroupRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
