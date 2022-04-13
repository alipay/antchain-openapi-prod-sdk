// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListContainerserviceIngressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 容器服务 Ingress 列表
    @NameInMap("ingresses")
    public java.util.List<IngressInfo> ingresses;

    public static ListContainerserviceIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerserviceIngressResponse self = new ListContainerserviceIngressResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerserviceIngressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListContainerserviceIngressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListContainerserviceIngressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListContainerserviceIngressResponse setIngresses(java.util.List<IngressInfo> ingresses) {
        this.ingresses = ingresses;
        return this;
    }
    public java.util.List<IngressInfo> getIngresses() {
        return this.ingresses;
    }

}
