// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEkytTrustsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应结果
    @NameInMap("success")
    public Boolean success;

    // 结果描述
    @NameInMap("message")
    public String message;

    // 可信签约签约单数据
    @NameInMap("data")
    public TrustSignQueryData data;

    public static QueryEkytTrustsignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEkytTrustsignResponse self = new QueryEkytTrustsignResponse();
        return TeaModel.build(map, self);
    }

    public QueryEkytTrustsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEkytTrustsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEkytTrustsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEkytTrustsignResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEkytTrustsignResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEkytTrustsignResponse setData(TrustSignQueryData data) {
        this.data = data;
        return this;
    }
    public TrustSignQueryData getData() {
        return this.data;
    }

}
