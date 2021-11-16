// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseFinancecertifyincontractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果
    @NameInMap("response_data")
    public String responseData;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseFinancecertifyincontractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseFinancecertifyincontractResponse self = new QueryLeaseFinancecertifyincontractResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseFinancecertifyincontractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseFinancecertifyincontractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseFinancecertifyincontractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseFinancecertifyincontractResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

    public QueryLeaseFinancecertifyincontractResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseFinancecertifyincontractResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
