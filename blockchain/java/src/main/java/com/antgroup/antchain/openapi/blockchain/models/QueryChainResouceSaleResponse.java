// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainResouceSaleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // reslut
    @NameInMap("reslut")
    public ALiYunChainResouceForSale reslut;

    public static QueryChainResouceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainResouceSaleResponse self = new QueryChainResouceSaleResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainResouceSaleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainResouceSaleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainResouceSaleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainResouceSaleResponse setReslut(ALiYunChainResouceForSale reslut) {
        this.reslut = reslut;
        return this;
    }
    public ALiYunChainResouceForSale getReslut() {
        return this.reslut;
    }

}
