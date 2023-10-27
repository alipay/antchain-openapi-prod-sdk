// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEkytDriverResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口响应结果
    @NameInMap("success")
    public Boolean success;

    // 接口响应描述
    @NameInMap("message")
    public String message;

    // 接口响应数据
    @NameInMap("data")
    public IifaaEkytResponse data;

    public static QueryEkytDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEkytDriverResponse self = new QueryEkytDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEkytDriverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEkytDriverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEkytDriverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEkytDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEkytDriverResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEkytDriverResponse setData(IifaaEkytResponse data) {
        this.data = data;
        return this;
    }
    public IifaaEkytResponse getData() {
        return this.data;
    }

}
