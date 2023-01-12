// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AllAppDeployviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 所有 workspace 的部署图/拓扑图
    @NameInMap("data")
    public java.util.List<DeployView> data;

    public static AllAppDeployviewResponse build(java.util.Map<String, ?> map) throws Exception {
        AllAppDeployviewResponse self = new AllAppDeployviewResponse();
        return TeaModel.build(map, self);
    }

    public AllAppDeployviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllAppDeployviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllAppDeployviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllAppDeployviewResponse setData(java.util.List<DeployView> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeployView> getData() {
        return this.data;
    }

}
