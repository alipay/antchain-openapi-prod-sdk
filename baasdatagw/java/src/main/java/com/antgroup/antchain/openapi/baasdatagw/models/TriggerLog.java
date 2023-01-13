// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class TriggerLog extends TeaModel {
    // 日志的唯一ID
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // 日志的发生时间
    @NameInMap("create_time")
    public Long createTime;

    // 日志的最近修改时间
    @NameInMap("modify_time")
    public Long modifyTime;

    // 日志发生的位置
    @NameInMap("position")
    @Validation(required = true)
    public TriggerCheckpoint position;

    // 日志状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static TriggerLog build(java.util.Map<String, ?> map) throws Exception {
        TriggerLog self = new TriggerLog();
        return TeaModel.build(map, self);
    }

    public TriggerLog setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TriggerLog setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public TriggerLog setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public TriggerLog setPosition(TriggerCheckpoint position) {
        this.position = position;
        return this;
    }
    public TriggerCheckpoint getPosition() {
        return this.position;
    }

    public TriggerLog setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
