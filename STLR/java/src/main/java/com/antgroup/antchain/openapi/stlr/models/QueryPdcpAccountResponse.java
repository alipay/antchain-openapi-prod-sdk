// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 开户结果
    @NameInMap("carbon_account_info")
    public AccountRegisterResponse carbonAccountInfo;

    public static QueryPdcpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpAccountResponse self = new QueryPdcpAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdcpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdcpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdcpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdcpAccountResponse setCarbonAccountInfo(AccountRegisterResponse carbonAccountInfo) {
        this.carbonAccountInfo = carbonAccountInfo;
        return this;
    }
    public AccountRegisterResponse getCarbonAccountInfo() {
        return this.carbonAccountInfo;
    }

}
