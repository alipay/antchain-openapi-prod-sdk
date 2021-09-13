// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套餐列表
    @NameInMap("combos")
    public java.util.List<Combo> combos;

    public static QueryComboResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComboResponse self = new QueryComboResponse();
        return TeaModel.build(map, self);
    }

    public QueryComboResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryComboResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryComboResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryComboResponse setCombos(java.util.List<Combo> combos) {
        this.combos = combos;
        return this;
    }
    public java.util.List<Combo> getCombos() {
        return this.combos;
    }

}
