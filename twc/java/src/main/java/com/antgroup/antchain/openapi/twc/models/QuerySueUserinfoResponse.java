// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QuerySueUserinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码 0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息
    @NameInMap("err_message")
    public String errMessage;

    // 用户违约个数
    @NameInMap("response_data")
    public Long responseData;

    public static QuerySueUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySueUserinfoResponse self = new QuerySueUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySueUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySueUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySueUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySueUserinfoResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QuerySueUserinfoResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QuerySueUserinfoResponse setResponseData(Long responseData) {
        this.responseData = responseData;
        return this;
    }
    public Long getResponseData() {
        return this.responseData;
    }

}
