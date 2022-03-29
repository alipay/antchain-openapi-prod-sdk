// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class QueryApiserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套件信息
    @NameInMap("api_suite")
    public ApiSuite apiSuite;

    // api基本信息
    @NameInMap("api_meta")
    public ApiMeta apiMeta;

    // api版本数据
    @NameInMap("api_version")
    public ApiVersion apiVersion;

    // api分组信息
    @NameInMap("api_group")
    public ApiGroup apiGroup;

    // api请求参数
    @NameInMap("request_params")
    public java.util.List<ParamModal> requestParams;

    // api返回参数
    @NameInMap("response_params")
    public java.util.List<ParamModal> responseParams;

    // 结果码
    @NameInMap("result_codes")
    public java.util.List<ResultCode> resultCodes;

    public static QueryApiserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiserviceResponse self = new QueryApiserviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiserviceResponse setApiSuite(ApiSuite apiSuite) {
        this.apiSuite = apiSuite;
        return this;
    }
    public ApiSuite getApiSuite() {
        return this.apiSuite;
    }

    public QueryApiserviceResponse setApiMeta(ApiMeta apiMeta) {
        this.apiMeta = apiMeta;
        return this;
    }
    public ApiMeta getApiMeta() {
        return this.apiMeta;
    }

    public QueryApiserviceResponse setApiVersion(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public ApiVersion getApiVersion() {
        return this.apiVersion;
    }

    public QueryApiserviceResponse setApiGroup(ApiGroup apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public ApiGroup getApiGroup() {
        return this.apiGroup;
    }

    public QueryApiserviceResponse setRequestParams(java.util.List<ParamModal> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.List<ParamModal> getRequestParams() {
        return this.requestParams;
    }

    public QueryApiserviceResponse setResponseParams(java.util.List<ParamModal> responseParams) {
        this.responseParams = responseParams;
        return this;
    }
    public java.util.List<ParamModal> getResponseParams() {
        return this.responseParams;
    }

    public QueryApiserviceResponse setResultCodes(java.util.List<ResultCode> resultCodes) {
        this.resultCodes = resultCodes;
        return this;
    }
    public java.util.List<ResultCode> getResultCodes() {
        return this.resultCodes;
    }

}
