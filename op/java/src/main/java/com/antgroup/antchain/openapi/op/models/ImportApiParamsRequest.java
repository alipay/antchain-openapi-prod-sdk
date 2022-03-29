// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportApiParamsRequest extends TeaModel {
    // 请求参数
    @NameInMap("request_params")
    public java.util.List<ApiParamRequest> requestParams;

    // 响应参数
    @NameInMap("response_params")
    public java.util.List<ApiParamRequest> responseParams;

    // 返回结果码
    @NameInMap("result_codes")
    public java.util.List<ResultCodeRequest> resultCodes;

    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // api版本
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    public static ImportApiParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportApiParamsRequest self = new ImportApiParamsRequest();
        return TeaModel.build(map, self);
    }

    public ImportApiParamsRequest setRequestParams(java.util.List<ApiParamRequest> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.List<ApiParamRequest> getRequestParams() {
        return this.requestParams;
    }

    public ImportApiParamsRequest setResponseParams(java.util.List<ApiParamRequest> responseParams) {
        this.responseParams = responseParams;
        return this;
    }
    public java.util.List<ApiParamRequest> getResponseParams() {
        return this.responseParams;
    }

    public ImportApiParamsRequest setResultCodes(java.util.List<ResultCodeRequest> resultCodes) {
        this.resultCodes = resultCodes;
        return this;
    }
    public java.util.List<ResultCodeRequest> getResultCodes() {
        return this.resultCodes;
    }

    public ImportApiParamsRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ImportApiParamsRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

}
