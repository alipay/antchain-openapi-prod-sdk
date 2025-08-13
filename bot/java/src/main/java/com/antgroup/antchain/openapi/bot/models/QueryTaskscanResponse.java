// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTaskscanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 错误信息
    @NameInMap("errormsg")
    public String errormsg;

    // 错误码
    @NameInMap("errorcode")
    public String errorcode;

    // 返回数据
    @NameInMap("data")
    public String data;

    public static QueryTaskscanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskscanResponse self = new QueryTaskscanResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskscanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTaskscanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTaskscanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTaskscanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTaskscanResponse setErrormsg(String errormsg) {
        this.errormsg = errormsg;
        return this;
    }
    public String getErrormsg() {
        return this.errormsg;
    }

    public QueryTaskscanResponse setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public QueryTaskscanResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
