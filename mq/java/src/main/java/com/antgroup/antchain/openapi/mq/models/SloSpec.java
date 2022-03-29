// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SloSpec extends TeaModel {
    // 是否开启
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // 是否是常驻任务
    @NameInMap("long_running_task")
    @Validation(required = true)
    public Boolean longRunningTask;

    // 默认可接受执行时间
    @NameInMap("default_acceptable_execution_interval")
    @Validation(required = true)
    public Long defaultAcceptableExecutionInterval;

    public static SloSpec build(java.util.Map<String, ?> map) throws Exception {
        SloSpec self = new SloSpec();
        return TeaModel.build(map, self);
    }

    public SloSpec setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SloSpec setLongRunningTask(Boolean longRunningTask) {
        this.longRunningTask = longRunningTask;
        return this;
    }
    public Boolean getLongRunningTask() {
        return this.longRunningTask;
    }

    public SloSpec setDefaultAcceptableExecutionInterval(Long defaultAcceptableExecutionInterval) {
        this.defaultAcceptableExecutionInterval = defaultAcceptableExecutionInterval;
        return this;
    }
    public Long getDefaultAcceptableExecutionInterval() {
        return this.defaultAcceptableExecutionInterval;
    }

}
