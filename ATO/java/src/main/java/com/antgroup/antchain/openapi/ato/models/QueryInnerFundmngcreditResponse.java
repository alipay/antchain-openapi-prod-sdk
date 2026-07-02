// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundmngcreditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证内容列表
    @NameInMap("credit_list")
    public java.util.List<InnerCreditInfo> creditList;

    public static QueryInnerFundmngcreditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundmngcreditResponse self = new QueryInnerFundmngcreditResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundmngcreditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFundmngcreditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFundmngcreditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFundmngcreditResponse setCreditList(java.util.List<InnerCreditInfo> creditList) {
        this.creditList = creditList;
        return this;
    }
    public java.util.List<InnerCreditInfo> getCreditList() {
        return this.creditList;
    }

}
