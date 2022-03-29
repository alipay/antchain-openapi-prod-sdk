// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsLogreaderrorResponse extends TeaModel {
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
    public ErrorRealte data;

    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // rid
    @NameInMap("rid")
    public String rid;

    // success
    @NameInMap("success")
    public Boolean success;

    public static QueryRmsLogreaderrorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsLogreaderrorResponse self = new QueryRmsLogreaderrorResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsLogreaderrorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsLogreaderrorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsLogreaderrorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsLogreaderrorResponse setData(ErrorRealte data) {
        this.data = data;
        return this;
    }
    public ErrorRealte getData() {
        return this.data;
    }

    public QueryRmsLogreaderrorResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryRmsLogreaderrorResponse setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public QueryRmsLogreaderrorResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
