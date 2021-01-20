// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetDeploymentResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 此部署操作中所有被操作的应用详情，以操作链的形式体现
    @NameInMap("application_chains")
    public java.util.List<OpsApplicationChain> applicationChains;

    // 部署操作执行者
    @NameInMap("executor")
    public String executor;

    // 
    //                             
    // 部署单状态。取值列表：
    // INITING：初始化中；
    // INIT_FAILED：初始化失败；
    // INITED：初始化完成；
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // CANCELING：取消中；
    // CANCELED：已取消
    //                             
    //                         
    @NameInMap("status")
    public String status;

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

    public GetDeploymentResponse setApplicationChains(java.util.List<OpsApplicationChain> applicationChains) {
        this.applicationChains = applicationChains;
        return this;
    }
    public java.util.List<OpsApplicationChain> getApplicationChains() {
        return this.applicationChains;
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

}
