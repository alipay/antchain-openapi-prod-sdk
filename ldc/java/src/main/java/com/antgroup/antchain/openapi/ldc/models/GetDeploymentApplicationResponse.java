// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetDeploymentApplicationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 
    //                   应用当前部署状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败
    //                 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 
    //                   应用发布版本
    //                 
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 此应用下所有计算容器分组部署状态详情
    @NameInMap("groups")
    @Validation(required = true)
    public java.util.List<OpsGroup> groups;

    // 应用前置任务
    @NameInMap("pre_tasks")
    @Validation(required = true)
    public java.util.List<OpsPrePostTask> preTasks;

    // 应用后置任务
    @NameInMap("post_tasks")
    @Validation(required = true)
    public java.util.List<OpsPrePostTask> postTasks;

    public static GetDeploymentApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentApplicationResponse self = new GetDeploymentApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentApplicationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDeploymentApplicationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDeploymentApplicationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDeploymentApplicationResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDeploymentApplicationResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetDeploymentApplicationResponse setGroups(java.util.List<OpsGroup> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<OpsGroup> getGroups() {
        return this.groups;
    }

    public GetDeploymentApplicationResponse setPreTasks(java.util.List<OpsPrePostTask> preTasks) {
        this.preTasks = preTasks;
        return this;
    }
    public java.util.List<OpsPrePostTask> getPreTasks() {
        return this.preTasks;
    }

    public GetDeploymentApplicationResponse setPostTasks(java.util.List<OpsPrePostTask> postTasks) {
        this.postTasks = postTasks;
        return this;
    }
    public java.util.List<OpsPrePostTask> getPostTasks() {
        return this.postTasks;
    }

}
