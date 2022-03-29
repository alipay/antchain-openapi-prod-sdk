// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiFrontendInfo extends TeaModel {
    // 是否有数据传输
    @NameInMap("file_transfer")
    @Validation(required = true)
    public Boolean fileTransfer;

    // api参数
    @NameInMap("request_path_params")
    @Validation(required = true)
    public java.util.List<String> requestPathParams;

    // Rest请求的URI，并带有路径参数
    @NameInMap("request_uri_with_path_params")
    @Validation(required = true)
    public String requestUriWithPathParams;

    // api参数
    @NameInMap("request_params")
    @Validation(required = true)
    public ApiParamInfo requestParams;

    public static ApiFrontendInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiFrontendInfo self = new ApiFrontendInfo();
        return TeaModel.build(map, self);
    }

    public ApiFrontendInfo setFileTransfer(Boolean fileTransfer) {
        this.fileTransfer = fileTransfer;
        return this;
    }
    public Boolean getFileTransfer() {
        return this.fileTransfer;
    }

    public ApiFrontendInfo setRequestPathParams(java.util.List<String> requestPathParams) {
        this.requestPathParams = requestPathParams;
        return this;
    }
    public java.util.List<String> getRequestPathParams() {
        return this.requestPathParams;
    }

    public ApiFrontendInfo setRequestUriWithPathParams(String requestUriWithPathParams) {
        this.requestUriWithPathParams = requestUriWithPathParams;
        return this;
    }
    public String getRequestUriWithPathParams() {
        return this.requestUriWithPathParams;
    }

    public ApiFrontendInfo setRequestParams(ApiParamInfo requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ApiParamInfo getRequestParams() {
        return this.requestParams;
    }

}
