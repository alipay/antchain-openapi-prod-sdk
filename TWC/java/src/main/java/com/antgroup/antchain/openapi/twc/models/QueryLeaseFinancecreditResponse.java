// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseFinancecreditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资租赁资金方金融科技租户id
    @NameInMap("credit_id")
    public String creditId;

    public static QueryLeaseFinancecreditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseFinancecreditResponse self = new QueryLeaseFinancecreditResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseFinancecreditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseFinancecreditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseFinancecreditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseFinancecreditResponse setCreditId(String creditId) {
        this.creditId = creditId;
        return this;
    }
    public String getCreditId() {
        return this.creditId;
    }

}
