// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbCompanyCreditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信额度，单位元
    @NameInMap("credit_amount")
    public Long creditAmount;

    // 额外特征字段
    @NameInMap("extra")
    public String extra;

    public static QueryRbbCompanyCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbCompanyCreditResponse self = new QueryRbbCompanyCreditResponse();
        return TeaModel.build(map, self);
    }

    public QueryRbbCompanyCreditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRbbCompanyCreditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRbbCompanyCreditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRbbCompanyCreditResponse setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Long getCreditAmount() {
        return this.creditAmount;
    }

    public QueryRbbCompanyCreditResponse setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
