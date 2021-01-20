// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetAppopsResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 此运维操作中所有被操作的应用详情，以操作链的形式体现
    @NameInMap("application_chains")
    public java.util.List<OpsApplicationChain> applicationChains;

    // 运维操作执行者
    @NameInMap("executor")
    public String executor;

    // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
    @NameInMap("ops_action")
    public String opsAction;

    // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
    @NameInMap("ops_dimension")
    public String opsDimension;

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

    // 应用运维单标题
    @NameInMap("title")
    public String title;

    public static GetAppopsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppopsResponse self = new GetAppopsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppopsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppopsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppopsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppopsResponse setApplicationChains(java.util.List<OpsApplicationChain> applicationChains) {
        this.applicationChains = applicationChains;
        return this;
    }
    public java.util.List<OpsApplicationChain> getApplicationChains() {
        return this.applicationChains;
    }

    public GetAppopsResponse setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public GetAppopsResponse setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public GetAppopsResponse setOpsDimension(String opsDimension) {
        this.opsDimension = opsDimension;
        return this;
    }
    public String getOpsDimension() {
        return this.opsDimension;
    }

    public GetAppopsResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAppopsResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
