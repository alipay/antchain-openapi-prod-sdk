// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class QueryQueryFirmfinancialResponse extends TeaModel {
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

    // 结果码
    @NameInMap("error_code")
    public String errorCode;

    // 结果消息
    @NameInMap("error_msg")
    public String errorMsg;

    // 财报状态(true已上传，false未上传)
    @NameInMap("status")
    public Boolean status;

    // 查询结果
    @NameInMap("account_result")
    public java.util.List<FileInfo> accountResult;

    public static QueryQueryFirmfinancialResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQueryFirmfinancialResponse self = new QueryQueryFirmfinancialResponse();
        return TeaModel.build(map, self);
    }

    public QueryQueryFirmfinancialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQueryFirmfinancialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQueryFirmfinancialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQueryFirmfinancialResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryQueryFirmfinancialResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryQueryFirmfinancialResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryQueryFirmfinancialResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public QueryQueryFirmfinancialResponse setAccountResult(java.util.List<FileInfo> accountResult) {
        this.accountResult = accountResult;
        return this;
    }
    public java.util.List<FileInfo> getAccountResult() {
        return this.accountResult;
    }

}
