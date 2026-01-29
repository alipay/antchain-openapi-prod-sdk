// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DownloadInnerFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 文件key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    public static DownloadInnerFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadInnerFileRequest self = new DownloadInnerFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadInnerFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadInnerFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadInnerFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DownloadInnerFileRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public DownloadInnerFileRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
