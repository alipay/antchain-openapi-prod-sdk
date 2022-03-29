// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicDTO extends TeaModel {
    // 集群名称
    @NameInMap("cluster")
    public String cluster;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 数据库 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息类型。取值说明如下：
    // 
    // 0：普通消息
    // 1：分区顺序消息
    // 2：全局顺序消息
    // 4：事务消息
    // 5：定时/延时消息
    @NameInMap("message_type")
    @Validation(required = true)
    public Long messageType;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // 设置该 Topic 的读写模式。取值说明如下：
    // 
    // 6：同时支持读写
    // 4：禁写
    // 2：禁读
    @NameInMap("perm")
    @Validation(required = true)
    public Long perm;

    // 读分区数
    @NameInMap("read_queue_num")
    public Long readQueueNum;

    // Topic 备注信息
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 写分区数
    @NameInMap("write_queue_num")
    public Long writeQueueNum;

    // 生效范围
    @NameInMap("scope")
    public String scope;

    // 版本号
    @NameInMap("version")
    public Long version;

    // 删除标志
    @NameInMap("delete_mark")
    public String deleteMark;

    // true标识该topic带有schema，否则不带schema
    @NameInMap("schema_mark")
    public Boolean schemaMark;

    // Topic对应Schema配置的序列化方式
    @NameInMap("schema_serialization")
    public String schemaSerialization;

    // Topic对应的Schema的兼容性策略
    @NameInMap("schema_compatibility")
    public String schemaCompatibility;

    // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
    @NameInMap("owner")
    public String owner;

    public static TopicDTO build(java.util.Map<String, ?> map) throws Exception {
        TopicDTO self = new TopicDTO();
        return TeaModel.build(map, self);
    }

    public TopicDTO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public TopicDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public TopicDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public TopicDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TopicDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TopicDTO setMessageType(Long messageType) {
        this.messageType = messageType;
        return this;
    }
    public Long getMessageType() {
        return this.messageType;
    }

    public TopicDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TopicDTO setPerm(Long perm) {
        this.perm = perm;
        return this;
    }
    public Long getPerm() {
        return this.perm;
    }

    public TopicDTO setReadQueueNum(Long readQueueNum) {
        this.readQueueNum = readQueueNum;
        return this;
    }
    public Long getReadQueueNum() {
        return this.readQueueNum;
    }

    public TopicDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public TopicDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public TopicDTO setWriteQueueNum(Long writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
        return this;
    }
    public Long getWriteQueueNum() {
        return this.writeQueueNum;
    }

    public TopicDTO setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TopicDTO setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public TopicDTO setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark;
        return this;
    }
    public String getDeleteMark() {
        return this.deleteMark;
    }

    public TopicDTO setSchemaMark(Boolean schemaMark) {
        this.schemaMark = schemaMark;
        return this;
    }
    public Boolean getSchemaMark() {
        return this.schemaMark;
    }

    public TopicDTO setSchemaSerialization(String schemaSerialization) {
        this.schemaSerialization = schemaSerialization;
        return this;
    }
    public String getSchemaSerialization() {
        return this.schemaSerialization;
    }

    public TopicDTO setSchemaCompatibility(String schemaCompatibility) {
        this.schemaCompatibility = schemaCompatibility;
        return this;
    }
    public String getSchemaCompatibility() {
        return this.schemaCompatibility;
    }

    public TopicDTO setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
