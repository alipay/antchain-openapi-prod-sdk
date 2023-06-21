// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryIcmSimpleauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支持的数据类型，结果数据
    @NameInMap("return_result")
    public String returnResult;

    public static QueryIcmSimpleauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIcmSimpleauthResponse self = new QueryIcmSimpleauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryIcmSimpleauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIcmSimpleauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIcmSimpleauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIcmSimpleauthResponse setReturnResult(String returnResult) {
        this.returnResult = returnResult;
        return this;
    }
    public String getReturnResult() {
        return this.returnResult;
    }

}
