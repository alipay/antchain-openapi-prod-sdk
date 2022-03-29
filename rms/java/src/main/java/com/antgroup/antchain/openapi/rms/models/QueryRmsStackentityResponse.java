// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsStackentityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<LongKeySet> data;

    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // rid
    @NameInMap("rid")
    public String rid;

    // success
    @NameInMap("success")
    public Boolean success;

    public static QueryRmsStackentityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsStackentityResponse self = new QueryRmsStackentityResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsStackentityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsStackentityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsStackentityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsStackentityResponse setData(java.util.List<LongKeySet> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LongKeySet> getData() {
        return this.data;
    }

    public QueryRmsStackentityResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryRmsStackentityResponse setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public QueryRmsStackentityResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
