// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecuteProgress extends TeaModel {
    // 阻塞个数
    @NameInMap("blocked")
    @Validation(required = true)
    public Long blocked;

    // 执行中个数
    @NameInMap("executing")
    @Validation(required = true)
    public Long executing;

    // 失败个数
    @NameInMap("failed")
    @Validation(required = true)
    public Long failed;

    // 执行对象ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 初始化机器个数
    @NameInMap("inited")
    @Validation(required = true)
    public Long inited;

    // 执行对象状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 成功个数
    @NameInMap("success")
    @Validation(required = true)
    public Long success;

    // 总计
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 等待中个数
    @NameInMap("waiting")
    @Validation(required = true)
    public Long waiting;

    public static ExecuteProgress build(java.util.Map<String, ?> map) throws Exception {
        ExecuteProgress self = new ExecuteProgress();
        return TeaModel.build(map, self);
    }

    public ExecuteProgress setBlocked(Long blocked) {
        this.blocked = blocked;
        return this;
    }
    public Long getBlocked() {
        return this.blocked;
    }

    public ExecuteProgress setExecuting(Long executing) {
        this.executing = executing;
        return this;
    }
    public Long getExecuting() {
        return this.executing;
    }

    public ExecuteProgress setFailed(Long failed) {
        this.failed = failed;
        return this;
    }
    public Long getFailed() {
        return this.failed;
    }

    public ExecuteProgress setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecuteProgress setInited(Long inited) {
        this.inited = inited;
        return this;
    }
    public Long getInited() {
        return this.inited;
    }

    public ExecuteProgress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ExecuteProgress setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public ExecuteProgress setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ExecuteProgress setWaiting(Long waiting) {
        this.waiting = waiting;
        return this;
    }
    public Long getWaiting() {
        return this.waiting;
    }

}
