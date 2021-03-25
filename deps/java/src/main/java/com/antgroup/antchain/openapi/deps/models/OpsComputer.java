// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsComputer extends TeaModel {
    // 计算容器id
    @NameInMap("id")
    public String id;

    // 计算容器内网ip
    @NameInMap("inner_ip")
    public String innerIp;

    // 计算容器名称
    @NameInMap("name")
    public String name;

    // 计算容器当前运维状态。取值列表：
    //                     INITED：初始化完成；
    //                     EXECUTING：执行中；
    //                     SUCCESS：执行成功；
    //                     FAILED：执行失败；
    //                     CANCELED：已取消；
    //                     IGNORED：已忽略
    //                 
    @NameInMap("status")
    public String status;

    // 计算容器上执行的任务信息。任务信息列表中包含正在执行和执行完成的任务。
    @NameInMap("tasks")
    public java.util.List<OpsComputerTask> tasks;

    public static OpsComputer build(java.util.Map<String, ?> map) throws Exception {
        OpsComputer self = new OpsComputer();
        return TeaModel.build(map, self);
    }

    public OpsComputer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpsComputer setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public OpsComputer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsComputer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpsComputer setTasks(java.util.List<OpsComputerTask> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<OpsComputerTask> getTasks() {
        return this.tasks;
    }

}
