// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerSpecResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // computer spec list
    @NameInMap("data")
    public java.util.List<ComputerSpec> data;

    public static QueryComputerSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerSpecResponse self = new QueryComputerSpecResponse();
        return TeaModel.build(map, self);
    }

    public QueryComputerSpecResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryComputerSpecResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryComputerSpecResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryComputerSpecResponse setData(java.util.List<ComputerSpec> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ComputerSpec> getData() {
        return this.data;
    }

}
