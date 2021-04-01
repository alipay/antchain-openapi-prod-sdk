// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDataauthorizationDepositDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证交易内容
    @NameInMap("tx_data")
    public String txData;

    public static QueryDataauthorizationDepositDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataauthorizationDepositDataResponse self = new QueryDataauthorizationDepositDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataauthorizationDepositDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDataauthorizationDepositDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDataauthorizationDepositDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDataauthorizationDepositDataResponse setTxData(String txData) {
        this.txData = txData;
        return this;
    }
    public String getTxData() {
        return this.txData;
    }

}
