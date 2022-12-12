// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEmissionCounteractionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 碳抵消量按抵消类型分组统计
    @NameInMap("list")
    public java.util.List<EmissionCounteractionStatistics> list;

    public static QueryEmissionCounteractionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmissionCounteractionResponse self = new QueryEmissionCounteractionResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmissionCounteractionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEmissionCounteractionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEmissionCounteractionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEmissionCounteractionResponse setList(java.util.List<EmissionCounteractionStatistics> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EmissionCounteractionStatistics> getList() {
        return this.list;
    }

}
