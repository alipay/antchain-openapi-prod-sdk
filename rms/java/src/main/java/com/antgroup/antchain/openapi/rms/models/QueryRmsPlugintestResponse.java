// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsPlugintestResponse extends TeaModel {
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
    public Threshold data;

    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // rid
    @NameInMap("rid")
    public String rid;

    // success
    @NameInMap("success")
    public Boolean success;

    public static QueryRmsPlugintestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsPlugintestResponse self = new QueryRmsPlugintestResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsPlugintestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsPlugintestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsPlugintestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsPlugintestResponse setData(Threshold data) {
        this.data = data;
        return this;
    }
    public Threshold getData() {
        return this.data;
    }

    public QueryRmsPlugintestResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryRmsPlugintestResponse setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public QueryRmsPlugintestResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
