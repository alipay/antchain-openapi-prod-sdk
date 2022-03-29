// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GroupDTO extends TeaModel {
    // 集群名
    @NameInMap("cluster")
    public String cluster;

    // 删除标志
    @NameInMap("delete_mark")
    public String deleteMark;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
    // 
    // tcp：表示该 Group ID 仅适用于 TCP 协议的消息收发。
    // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
    @NameInMap("group_type")
    @Validation(required = true)
    public String groupType;

    // 数据库 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 读权限
    @NameInMap("read_enable")
    public Boolean readEnable;

    // Group 备注信息
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 生效范围
    @NameInMap("scope")
    public String scope;

    // 版本号
    @NameInMap("version")
    public Long version;

    // retry topic读队列数
    @NameInMap("retry_read_queue_num")
    public Long retryReadQueueNum;

    // retry topic写队列数
    @NameInMap("retry_write_queue_num")
    public Long retryWriteQueueNum;

    // retry topic读写权限
    @NameInMap("retry_perm")
    public Long retryPerm;

    // Group 所属的应用名称，要求应用名在 zappinfo 上可查
    @NameInMap("owner")
    public String owner;

    public static GroupDTO build(java.util.Map<String, ?> map) throws Exception {
        GroupDTO self = new GroupDTO();
        return TeaModel.build(map, self);
    }

    public GroupDTO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GroupDTO setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark;
        return this;
    }
    public String getDeleteMark() {
        return this.deleteMark;
    }

    public GroupDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public GroupDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GroupDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GroupDTO setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public GroupDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GroupDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GroupDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public GroupDTO setReadEnable(Boolean readEnable) {
        this.readEnable = readEnable;
        return this;
    }
    public Boolean getReadEnable() {
        return this.readEnable;
    }

    public GroupDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GroupDTO setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GroupDTO setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public GroupDTO setRetryReadQueueNum(Long retryReadQueueNum) {
        this.retryReadQueueNum = retryReadQueueNum;
        return this;
    }
    public Long getRetryReadQueueNum() {
        return this.retryReadQueueNum;
    }

    public GroupDTO setRetryWriteQueueNum(Long retryWriteQueueNum) {
        this.retryWriteQueueNum = retryWriteQueueNum;
        return this;
    }
    public Long getRetryWriteQueueNum() {
        return this.retryWriteQueueNum;
    }

    public GroupDTO setRetryPerm(Long retryPerm) {
        this.retryPerm = retryPerm;
        return this;
    }
    public Long getRetryPerm() {
        return this.retryPerm;
    }

    public GroupDTO setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
