// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqNamespaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ns
    @NameInMap("data")
    public java.util.List<NamespaceDO> data;

    public static ListSofamqNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqNamespaceResponse self = new ListSofamqNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqNamespaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqNamespaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqNamespaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqNamespaceResponse setData(java.util.List<NamespaceDO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NamespaceDO> getData() {
        return this.data;
    }

}
