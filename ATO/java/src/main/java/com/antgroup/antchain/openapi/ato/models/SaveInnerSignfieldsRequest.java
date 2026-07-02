// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SaveInnerSignfieldsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 魔法库模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 魔法库模板版本
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    // 模板签署区列表
    @NameInMap("sign_field_list")
    @Validation(required = true)
    public String signFieldList;

    public static SaveInnerSignfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveInnerSignfieldsRequest self = new SaveInnerSignfieldsRequest();
        return TeaModel.build(map, self);
    }

    public SaveInnerSignfieldsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveInnerSignfieldsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveInnerSignfieldsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveInnerSignfieldsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SaveInnerSignfieldsRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public SaveInnerSignfieldsRequest setSignFieldList(String signFieldList) {
        this.signFieldList = signFieldList;
        return this;
    }
    public String getSignFieldList() {
        return this.signFieldList;
    }

}
