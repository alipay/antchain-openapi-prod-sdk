// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBlocrBusinesslicenseResponse extends TeaModel {
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
    @NameInMap("algo_ret")
    public Long algoRet;

    // 框架错误信息
    @NameInMap("message")
    public String message;

    // 算法结果,JSON String
    @NameInMap("result")
    public String result;

    // 框架inference服务错误码，0为正常
    @NameInMap("ret")
    public Long ret;

    public static QueryBlocrBusinesslicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlocrBusinesslicenseResponse self = new QueryBlocrBusinesslicenseResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlocrBusinesslicenseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlocrBusinesslicenseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlocrBusinesslicenseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlocrBusinesslicenseResponse setAlgoMsg(String algoMsg) {
        this.algoMsg = algoMsg;
        return this;
    }
    public String getAlgoMsg() {
        return this.algoMsg;
    }

    public QueryBlocrBusinesslicenseResponse setAlgoRet(Long algoRet) {
        this.algoRet = algoRet;
        return this;
    }
    public Long getAlgoRet() {
        return this.algoRet;
    }

    public QueryBlocrBusinesslicenseResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBlocrBusinesslicenseResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryBlocrBusinesslicenseResponse setRet(Long ret) {
        this.ret = ret;
        return this;
    }
    public Long getRet() {
        return this.ret;
    }

}
