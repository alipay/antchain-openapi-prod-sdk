// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportApiserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // api基本信息
    @NameInMap("api_meta_request")
    @Validation(required = true)
    public ApiMetaRequest apiMetaRequest;

    // api版本
    @NameInMap("api_version_request")
    @Validation(required = true)
    public ApiVersionRequest apiVersionRequest;

    // api请求参数
    @NameInMap("import_api_params_request")
    public ImportApiParamsRequest importApiParamsRequest;

    public static ImportApiserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportApiserviceRequest self = new ImportApiserviceRequest();
        return TeaModel.build(map, self);
    }

    public ImportApiserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportApiserviceRequest setApiMetaRequest(ApiMetaRequest apiMetaRequest) {
        this.apiMetaRequest = apiMetaRequest;
        return this;
    }
    public ApiMetaRequest getApiMetaRequest() {
        return this.apiMetaRequest;
    }

    public ImportApiserviceRequest setApiVersionRequest(ApiVersionRequest apiVersionRequest) {
        this.apiVersionRequest = apiVersionRequest;
        return this;
    }
    public ApiVersionRequest getApiVersionRequest() {
        return this.apiVersionRequest;
    }

    public ImportApiserviceRequest setImportApiParamsRequest(ImportApiParamsRequest importApiParamsRequest) {
        this.importApiParamsRequest = importApiParamsRequest;
        return this;
    }
    public ImportApiParamsRequest getImportApiParamsRequest() {
        return this.importApiParamsRequest;
    }

}
