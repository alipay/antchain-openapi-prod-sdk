// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceVcomputerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // v_computers
    @NameInMap("data")
    public java.util.List<VComputer> data;

    public static QueryLoadbalanceVcomputerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceVcomputerResponse self = new QueryLoadbalanceVcomputerResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceVcomputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalanceVcomputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalanceVcomputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalanceVcomputerResponse setData(java.util.List<VComputer> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VComputer> getData() {
        return this.data;
    }

}
