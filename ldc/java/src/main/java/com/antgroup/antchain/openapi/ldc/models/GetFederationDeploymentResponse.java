// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetFederationDeploymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 联邦无状态工作负载
    @NameInMap("data")
    public FederatedDeployment data;

    public static GetFederationDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFederationDeploymentResponse self = new GetFederationDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetFederationDeploymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFederationDeploymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFederationDeploymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFederationDeploymentResponse setData(FederatedDeployment data) {
        this.data = data;
        return this;
    }
    public FederatedDeployment getData() {
        return this.data;
    }

}
