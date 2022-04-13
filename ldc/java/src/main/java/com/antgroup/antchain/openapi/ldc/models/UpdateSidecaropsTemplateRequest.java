// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateSidecaropsTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要更新的sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // 指定要更新的sidecar版本
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 根据image筛选要更新的基线
    @NameInMap("image")
    public String image;

    // 要更新的sidecar模板
    @NameInMap("template")
    public String template;

    // 要设置成的scope
    @NameInMap("scope")
    public java.util.List<String> scope;

    public static UpdateSidecaropsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecaropsTemplateRequest self = new UpdateSidecaropsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecaropsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecaropsTemplateRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public UpdateSidecaropsTemplateRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public UpdateSidecaropsTemplateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateSidecaropsTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateSidecaropsTemplateRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

}
