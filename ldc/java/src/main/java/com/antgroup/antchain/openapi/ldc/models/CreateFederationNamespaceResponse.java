// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationNamespaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // fed namespace info
    @NameInMap("data")
    public FedNamespace data;

    public static CreateFederationNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationNamespaceResponse self = new CreateFederationNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateFederationNamespaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateFederationNamespaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateFederationNamespaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateFederationNamespaceResponse setData(FedNamespace data) {
        this.data = data;
        return this;
    }
    public FedNamespace getData() {
        return this.data;
    }

}
