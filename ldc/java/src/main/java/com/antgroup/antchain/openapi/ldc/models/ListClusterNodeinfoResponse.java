// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListClusterNodeinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // node infos of specific cluster
    @NameInMap("data")
    public java.util.List<NodeInfo> data;

    public static ListClusterNodeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeinfoResponse self = new ListClusterNodeinfoResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListClusterNodeinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClusterNodeinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListClusterNodeinfoResponse setData(java.util.List<NodeInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NodeInfo> getData() {
        return this.data;
    }

}
