// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryInvoicesocrVatinvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 算法错误信息
    @NameInMap("algo_msg")
    public String algoMsg;

    // 算法异常错误码
    // 
    @NameInMap("algo_ret")
    public String algoRet;

    // 框架错误信息
    // 
    @NameInMap("message")
    public String message;

    // 算法结果,JSON String
    @NameInMap("result")
    public String result;

    // 框架inference服务错误码，0为正常
    @NameInMap("ret")
    public String ret;

    public static QueryInvoicesocrVatinvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoicesocrVatinvoiceResponse self = new QueryInvoicesocrVatinvoiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryInvoicesocrVatinvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInvoicesocrVatinvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInvoicesocrVatinvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInvoicesocrVatinvoiceResponse setAlgoMsg(String algoMsg) {
        this.algoMsg = algoMsg;
        return this;
    }
    public String getAlgoMsg() {
        return this.algoMsg;
    }

    public QueryInvoicesocrVatinvoiceResponse setAlgoRet(String algoRet) {
        this.algoRet = algoRet;
        return this;
    }
    public String getAlgoRet() {
        return this.algoRet;
    }

    public QueryInvoicesocrVatinvoiceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInvoicesocrVatinvoiceResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryInvoicesocrVatinvoiceResponse setRet(String ret) {
        this.ret = ret;
        return this;
    }
    public String getRet() {
        return this.ret;
    }

}
