// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppDeployGroup extends TeaModel {
    // 发布任务
    @NameInMap("deploy_task")
    @Validation(required = true)
    public AppDeployTask deployTask;

    // 后置任务列表
    @NameInMap("post_tasks")
    @Validation(required = true)
    public java.util.List<AppDeployTask> postTasks;

    // 前置任务列表
    @NameInMap("pre_tasks")
    @Validation(required = true)
    public java.util.List<AppDeployTask> preTasks;

    public static AppDeployGroup build(java.util.Map<String, ?> map) throws Exception {
        AppDeployGroup self = new AppDeployGroup();
        return TeaModel.build(map, self);
    }

    public AppDeployGroup setDeployTask(AppDeployTask deployTask) {
        this.deployTask = deployTask;
        return this;
    }
    public AppDeployTask getDeployTask() {
        return this.deployTask;
    }

    public AppDeployGroup setPostTasks(java.util.List<AppDeployTask> postTasks) {
        this.postTasks = postTasks;
        return this;
    }
    public java.util.List<AppDeployTask> getPostTasks() {
        return this.postTasks;
    }

    public AppDeployGroup setPreTasks(java.util.List<AppDeployTask> preTasks) {
        this.preTasks = preTasks;
        return this;
    }
    public java.util.List<AppDeployTask> getPreTasks() {
        return this.preTasks;
    }

}
