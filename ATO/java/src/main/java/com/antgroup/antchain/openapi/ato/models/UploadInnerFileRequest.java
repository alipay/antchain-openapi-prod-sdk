// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadInnerFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // ● BUSINESS_LICENSE 营业执照
    // ● CARD_FRONT 身份证正面
    // ● CARD_BACK 身份证反面
    // ● SPLITTING 分账
    // ● CONTRACT_TEMPLATE 合同模板
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    public static UploadInnerFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadInnerFileRequest self = new UploadInnerFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadInnerFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadInnerFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadInnerFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UploadInnerFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadInnerFileRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public UploadInnerFileRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
