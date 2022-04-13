// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetDeploymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作执行者
    @NameInMap("executor")
    @Validation(required = true)
    public String executor;

    // 
    //                   发布单状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；CANCELING：取消中；CANCELED：已取消
    //                 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 此发布部署操作中所有被操作的应用详情，以操作链的形式体现
    @NameInMap("application_chains")
    @Validation(required = true)
    public java.util.List<OpsApplicationChain> applicationChains;

    public static GetDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponse self = new GetDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDeploymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDeploymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDeploymentResponse setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public GetDeploymentResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDeploymentResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetDeploymentResponse setApplicationChains(java.util.List<OpsApplicationChain> applicationChains) {
        this.applicationChains = applicationChains;
        return this;
    }
    public java.util.List<OpsApplicationChain> getApplicationChains() {
        return this.applicationChains;
    }

}
