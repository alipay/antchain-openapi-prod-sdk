// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundmngaccountinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资方账号信息，FundAccountInfo
    @NameInMap("fund_account_info")
    public String fundAccountInfo;

    public static QueryInnerFundmngaccountinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundmngaccountinfoResponse self = new QueryInnerFundmngaccountinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundmngaccountinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFundmngaccountinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFundmngaccountinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFundmngaccountinfoResponse setFundAccountInfo(String fundAccountInfo) {
        this.fundAccountInfo = fundAccountInfo;
        return this;
    }
    public String getFundAccountInfo() {
        return this.fundAccountInfo;
    }

}
