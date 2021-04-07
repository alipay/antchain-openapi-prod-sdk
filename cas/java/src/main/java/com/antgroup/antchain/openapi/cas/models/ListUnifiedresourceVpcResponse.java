// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListUnifiedresourceVpcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // vpc list
    @NameInMap("data")
    public java.util.List<VPC> data;

    public static ListUnifiedresourceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnifiedresourceVpcResponse self = new ListUnifiedresourceVpcResponse();
        return TeaModel.build(map, self);
    }

    public ListUnifiedresourceVpcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUnifiedresourceVpcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUnifiedresourceVpcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUnifiedresourceVpcResponse setData(java.util.List<VPC> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VPC> getData() {
        return this.data;
    }

}
