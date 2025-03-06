// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarrierRepairmobileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 失联人手机号修复数量
    @NameInMap("count")
    public String count;

    public static QueryCarrierRepairmobileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarrierRepairmobileResponse self = new QueryCarrierRepairmobileResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarrierRepairmobileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCarrierRepairmobileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCarrierRepairmobileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCarrierRepairmobileResponse setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

}
