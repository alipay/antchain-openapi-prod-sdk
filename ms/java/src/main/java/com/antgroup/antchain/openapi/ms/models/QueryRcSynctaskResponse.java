// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryRcSynctaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 所有服务的同步状态信息
    @NameInMap("data")
    public java.util.List<ServiceSyncStatus> data;

    public static QueryRcSynctaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRcSynctaskResponse self = new QueryRcSynctaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRcSynctaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRcSynctaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRcSynctaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRcSynctaskResponse setData(java.util.List<ServiceSyncStatus> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ServiceSyncStatus> getData() {
        return this.data;
    }

}
