// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ContainerInfo extends TeaModel {
    // 容器日志
    @NameInMap("log")
    @Validation(required = true)
    public String log;

    // 容器节点状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 结束时间
    @NameInMap("utc_end")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcEnd;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // 开始时间
    @NameInMap("utc_start")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcStart;

    public static ContainerInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerInfo self = new ContainerInfo();
        return TeaModel.build(map, self);
    }

    public ContainerInfo setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public ContainerInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ContainerInfo setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public ContainerInfo setUtcEnd(String utcEnd) {
        this.utcEnd = utcEnd;
        return this;
    }
    public String getUtcEnd() {
        return this.utcEnd;
    }

    public ContainerInfo setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public ContainerInfo setUtcStart(String utcStart) {
        this.utcStart = utcStart;
        return this;
    }
    public String getUtcStart() {
        return this.utcStart;
    }

}
