// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class WarnLogDTO extends TeaModel {
    // 单元名称
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

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

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 报警 ID
    @NameInMap("warn_id")
    @Validation(required = true)
    public Long warnId;

    // 报警信息
    @NameInMap("warn_info")
    @Validation(required = true)
    public String warnInfo;

    public static WarnLogDTO build(java.util.Map<String, ?> map) throws Exception {
        WarnLogDTO self = new WarnLogDTO();
        return TeaModel.build(map, self);
    }

    public WarnLogDTO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public WarnLogDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public WarnLogDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public WarnLogDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public WarnLogDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WarnLogDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public WarnLogDTO setWarnId(Long warnId) {
        this.warnId = warnId;
        return this;
    }
    public Long getWarnId() {
        return this.warnId;
    }

    public WarnLogDTO setWarnInfo(String warnInfo) {
        this.warnInfo = warnInfo;
        return this;
    }
    public String getWarnInfo() {
        return this.warnInfo;
    }

}
