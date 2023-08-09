// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryBusinessProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商业产品sdk客户端的maven依赖信息
    @NameInMap("sdk_maven_dependency_info")
    public SdkMavenDependencyInfo sdkMavenDependencyInfo;

    // 商业产品最新api信息列表，可能与当前版本jar包内api不一致，若发现不一致请在opm商业sdk管理中重新进行打包
    @NameInMap("api_info_models")
    public java.util.List<ApiInfoModel> apiInfoModels;

    // 已发布中央仓库的版本
    @NameInMap("publish_version")
    public String publishVersion;

    // 是否存在运行中的任务，商业产品一次发布中央仓库打包任务，会执行三个子打包任务，上传线下仓库，上传蚂蚁链sdk包至中央仓库，上传金融云sdk包至中央仓库
    @NameInMap("task_running")
    public Boolean taskRunning;

    // 最新一次打包任务运行状态RUNNING/SUCCESS/FAILED
    @NameInMap("task_status")
    public String taskStatus;

    // 能力sla看板url
    @NameInMap("sla_url")
    public String slaUrl;

    public static QueryBusinessProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessProductResponse self = new QueryBusinessProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessProductResponse setSdkMavenDependencyInfo(SdkMavenDependencyInfo sdkMavenDependencyInfo) {
        this.sdkMavenDependencyInfo = sdkMavenDependencyInfo;
        return this;
    }
    public SdkMavenDependencyInfo getSdkMavenDependencyInfo() {
        return this.sdkMavenDependencyInfo;
    }

    public QueryBusinessProductResponse setApiInfoModels(java.util.List<ApiInfoModel> apiInfoModels) {
        this.apiInfoModels = apiInfoModels;
        return this;
    }
    public java.util.List<ApiInfoModel> getApiInfoModels() {
        return this.apiInfoModels;
    }

    public QueryBusinessProductResponse setPublishVersion(String publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public String getPublishVersion() {
        return this.publishVersion;
    }

    public QueryBusinessProductResponse setTaskRunning(Boolean taskRunning) {
        this.taskRunning = taskRunning;
        return this;
    }
    public Boolean getTaskRunning() {
        return this.taskRunning;
    }

    public QueryBusinessProductResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public QueryBusinessProductResponse setSlaUrl(String slaUrl) {
        this.slaUrl = slaUrl;
        return this;
    }
    public String getSlaUrl() {
        return this.slaUrl;
    }

}
