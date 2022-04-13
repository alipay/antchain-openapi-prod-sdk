// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppDeployPodStateSummary extends TeaModel {
    // 执行对象ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 执行对象状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 总计
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 执行中个数
    @NameInMap("executing")
    @Validation(required = true)
    public Long executing;

    // 成功数
    @NameInMap("succeeded")
    @Validation(required = true)
    public Long succeeded;

    // 等待个数
    @NameInMap("waiting")
    @Validation(required = true)
    public Long waiting;

    // 失败个数
    @NameInMap("failed")
    @Validation(required = true)
    public Long failed;

    // 初始化个数
    // 
    @NameInMap("inited")
    @Validation(required = true)
    public Long inited;

    // 阻塞个数
    @NameInMap("blocked")
    @Validation(required = true)
    public Long blocked;

    public static AppDeployPodStateSummary build(java.util.Map<String, ?> map) throws Exception {
        AppDeployPodStateSummary self = new AppDeployPodStateSummary();
        return TeaModel.build(map, self);
    }

    public AppDeployPodStateSummary setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppDeployPodStateSummary setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppDeployPodStateSummary setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public AppDeployPodStateSummary setExecuting(Long executing) {
        this.executing = executing;
        return this;
    }
    public Long getExecuting() {
        return this.executing;
    }

    public AppDeployPodStateSummary setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
        return this;
    }
    public Long getSucceeded() {
        return this.succeeded;
    }

    public AppDeployPodStateSummary setWaiting(Long waiting) {
        this.waiting = waiting;
        return this;
    }
    public Long getWaiting() {
        return this.waiting;
    }

    public AppDeployPodStateSummary setFailed(Long failed) {
        this.failed = failed;
        return this;
    }
    public Long getFailed() {
        return this.failed;
    }

    public AppDeployPodStateSummary setInited(Long inited) {
        this.inited = inited;
        return this;
    }
    public Long getInited() {
        return this.inited;
    }

    public AppDeployPodStateSummary setBlocked(Long blocked) {
        this.blocked = blocked;
        return this;
    }
    public Long getBlocked() {
        return this.blocked;
    }

}
