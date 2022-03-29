// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueRouteRulesDTO extends TeaModel {
    // 应用
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 队列路由规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 方法
    @NameInMap("meth")
    @Validation(required = true)
    public String meth;

    // 路由规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 队列id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 分流开关
    @NameInMap("switch_status")
    @Validation(required = true)
    public Long switchStatus;

    // 路由类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueueRouteRulesDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueRouteRulesDTO self = new QueueRouteRulesDTO();
        return TeaModel.build(map, self);
    }

    public QueueRouteRulesDTO setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueueRouteRulesDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueueRouteRulesDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueueRouteRulesDTO setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public QueueRouteRulesDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueueRouteRulesDTO setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public QueueRouteRulesDTO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueueRouteRulesDTO setSwitchStatus(Long switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public Long getSwitchStatus() {
        return this.switchStatus;
    }

    public QueueRouteRulesDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
