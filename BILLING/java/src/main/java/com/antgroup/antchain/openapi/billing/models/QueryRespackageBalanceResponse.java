// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class QueryRespackageBalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资源包余量明细
    @NameInMap("balance_detail")
    public java.util.List<RespackegeBanlanceVO> balanceDetail;

    public static QueryRespackageBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRespackageBalanceResponse self = new QueryRespackageBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRespackageBalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRespackageBalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRespackageBalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRespackageBalanceResponse setBalanceDetail(java.util.List<RespackegeBanlanceVO> balanceDetail) {
        this.balanceDetail = balanceDetail;
        return this;
    }
    public java.util.List<RespackegeBanlanceVO> getBalanceDetail() {
        return this.balanceDetail;
    }

}
