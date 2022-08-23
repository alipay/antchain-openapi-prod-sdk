// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetProdsAppopsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。	
    // 
    @NameInMap("status")
    public String status;

    // 失败节点详情	
    // 
    @NameInMap("failed_nodes")
    public java.util.List<NodeExecutionLog> failedNodes;

    public static GetProdsAppopsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProdsAppopsResponse self = new GetProdsAppopsResponse();
        return TeaModel.build(map, self);
    }

    public GetProdsAppopsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetProdsAppopsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetProdsAppopsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetProdsAppopsResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetProdsAppopsResponse setFailedNodes(java.util.List<NodeExecutionLog> failedNodes) {
        this.failedNodes = failedNodes;
        return this;
    }
    public java.util.List<NodeExecutionLog> getFailedNodes() {
        return this.failedNodes;
    }

}
