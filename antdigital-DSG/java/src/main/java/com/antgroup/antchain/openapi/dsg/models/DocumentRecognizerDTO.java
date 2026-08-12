// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dsg.models;

import com.aliyun.tea.*;

public class DocumentRecognizerDTO extends TeaModel {
    // 要识别的文本
    /**
     * <strong>example:</strong>
     * <p>我是原恺，手机号16868356278</p>
     */
    @NameInMap("document")
    @Validation(required = true)
    public String document;

    // 调用的租户Id
    /**
     * <strong>example:</strong>
     * <p>7f3a9c2e1b4d4a86</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 企业 ID,用于接口鉴权
    /**
     * <strong>example:</strong>
     * <p>MaaS</p>
     */
    @NameInMap("enterprise_id")
    public String enterpriseId;

    public static DocumentRecognizerDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentRecognizerDTO self = new DocumentRecognizerDTO();
        return TeaModel.build(map, self);
    }

    public DocumentRecognizerDTO setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public DocumentRecognizerDTO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DocumentRecognizerDTO setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

}
