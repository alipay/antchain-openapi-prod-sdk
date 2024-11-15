// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class GetProductSaassdkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前的sdk版本
    @NameInMap("current_version")
    public String currentVersion;

    // 要发布的版本
    @NameInMap("publish_version")
    public String publishVersion;

    // 打包是否正在进行
    @NameInMap("task_running")
    public Boolean taskRunning;

    // 已经过发布的sdk
    @NameInMap("published_sdks")
    public java.util.List<MultiSdkItem> publishedSdks;

    // 任务状态
    @NameInMap("task_status")
    public String taskStatus;

    // 任务码
    @NameInMap("task_id")
    public String taskId;

    public static GetProductSaassdkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductSaassdkResponse self = new GetProductSaassdkResponse();
        return TeaModel.build(map, self);
    }

    public GetProductSaassdkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetProductSaassdkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetProductSaassdkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetProductSaassdkResponse setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public GetProductSaassdkResponse setPublishVersion(String publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public String getPublishVersion() {
        return this.publishVersion;
    }

    public GetProductSaassdkResponse setTaskRunning(Boolean taskRunning) {
        this.taskRunning = taskRunning;
        return this;
    }
    public Boolean getTaskRunning() {
        return this.taskRunning;
    }

    public GetProductSaassdkResponse setPublishedSdks(java.util.List<MultiSdkItem> publishedSdks) {
        this.publishedSdks = publishedSdks;
        return this;
    }
    public java.util.List<MultiSdkItem> getPublishedSdks() {
        return this.publishedSdks;
    }

    public GetProductSaassdkResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetProductSaassdkResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
