// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDacQuotaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // quotaType:DEPOSIT/WITHDRAWAL
    @NameInMap("quota_type")
    public String quotaType;

    // quotaAmount
    @NameInMap("quota_amount")
    public String quotaAmount;

    public static QueryDacQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDacQuotaResponse self = new QueryDacQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryDacQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDacQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDacQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDacQuotaResponse setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public QueryDacQuotaResponse setQuotaAmount(String quotaAmount) {
        this.quotaAmount = quotaAmount;
        return this;
    }
    public String getQuotaAmount() {
        return this.quotaAmount;
    }

}
