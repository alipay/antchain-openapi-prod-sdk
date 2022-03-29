// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueLimitRulesDTO extends TeaModel {
    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 限流规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 限流算法
    @NameInMap("l_algorithm")
    @Validation(required = true)
    public String lAlgorithm;

    // 限流后操作
    @NameInMap("l_operation")
    @Validation(required = true)
    public String lOperation;

    // 方法
    @NameInMap("meth")
    @Validation(required = true)
    public String meth;

    // 限流规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 队列id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 运行模式
    @NameInMap("r_mode")
    @Validation(required = true)
    public String rMode;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 应用名
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    public static QueueLimitRulesDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueLimitRulesDTO self = new QueueLimitRulesDTO();
        return TeaModel.build(map, self);
    }

    public QueueLimitRulesDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueueLimitRulesDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueueLimitRulesDTO setLAlgorithm(String lAlgorithm) {
        this.lAlgorithm = lAlgorithm;
        return this;
    }
    public String getLAlgorithm() {
        return this.lAlgorithm;
    }

    public QueueLimitRulesDTO setLOperation(String lOperation) {
        this.lOperation = lOperation;
        return this;
    }
    public String getLOperation() {
        return this.lOperation;
    }

    public QueueLimitRulesDTO setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public QueueLimitRulesDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueueLimitRulesDTO setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public QueueLimitRulesDTO setRMode(String rMode) {
        this.rMode = rMode;
        return this;
    }
    public String getRMode() {
        return this.rMode;
    }

    public QueueLimitRulesDTO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueueLimitRulesDTO setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

}
