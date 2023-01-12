// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetComputeropsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 运维操作执行者
    @NameInMap("executor")
    @Validation(required = true)
    public String executor;

    // 改运维单下所有计算容器分组运维状态详情
    @NameInMap("groups")
    @Validation(required = true)
    public java.util.List<OpsGroup> groups;

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
    @Validation(required = true)
    public String status;

    public static GetComputeropsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeropsResponse self = new GetComputeropsResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeropsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetComputeropsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetComputeropsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetComputeropsResponse setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public GetComputeropsResponse setGroups(java.util.List<OpsGroup> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<OpsGroup> getGroups() {
        return this.groups;
    }

    public GetComputeropsResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
