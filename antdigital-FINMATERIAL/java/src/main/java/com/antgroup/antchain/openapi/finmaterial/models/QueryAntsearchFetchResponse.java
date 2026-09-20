// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryAntsearchFetchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 网页读取和正文解析是否成功
    @NameInMap("is_success")
    public Boolean isSuccess;

    // 失败原因标识，仅失败时返回
    @NameInMap("error_code")
    public String errorCode;

    // 可读的失败原因，仅失败时返回
    @NameInMap("error_message")
    public String errorMessage;

    // 请求元信息
    @NameInMap("response_metadata")
    public ResponseMetadata responseMetadata;

    // 网页读取与正文解析成功时返回
    @NameInMap("result")
    public FetchResult result;

    public static QueryAntsearchFetchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsearchFetchResponse self = new QueryAntsearchFetchResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsearchFetchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsearchFetchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsearchFetchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsearchFetchResponse setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public QueryAntsearchFetchResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryAntsearchFetchResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAntsearchFetchResponse setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }
    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public QueryAntsearchFetchResponse setResult(FetchResult result) {
        this.result = result;
        return this;
    }
    public FetchResult getResult() {
        return this.result;
    }

}
