// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class PagequeryChaininsightAccountmodifytxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("result")
    public ChainInsightTransactionInfoPageableResponse result;

    public static PagequeryChaininsightAccountmodifytxResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryChaininsightAccountmodifytxResponse self = new PagequeryChaininsightAccountmodifytxResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryChaininsightAccountmodifytxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryChaininsightAccountmodifytxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryChaininsightAccountmodifytxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryChaininsightAccountmodifytxResponse setResult(ChainInsightTransactionInfoPageableResponse result) {
        this.result = result;
        return this;
    }
    public ChainInsightTransactionInfoPageableResponse getResult() {
        return this.result;
    }

}
