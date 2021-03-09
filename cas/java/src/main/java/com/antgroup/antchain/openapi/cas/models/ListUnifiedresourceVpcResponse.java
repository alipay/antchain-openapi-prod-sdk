// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListUnifiedresourceVpcResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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
