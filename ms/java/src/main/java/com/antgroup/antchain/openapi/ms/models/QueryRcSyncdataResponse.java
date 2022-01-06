// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryRcSyncdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询某个服务具体同步的数据
    @NameInMap("data")
    public java.util.List<SyncData> data;

    public static QueryRcSyncdataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRcSyncdataResponse self = new QueryRcSyncdataResponse();
        return TeaModel.build(map, self);
    }

    public QueryRcSyncdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRcSyncdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRcSyncdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRcSyncdataResponse setData(java.util.List<SyncData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SyncData> getData() {
        return this.data;
    }

}
