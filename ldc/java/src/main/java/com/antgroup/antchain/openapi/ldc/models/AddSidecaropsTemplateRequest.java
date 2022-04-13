// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddSidecaropsTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // 镜像地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 新的模板
    @NameInMap("template")
    public String template;

    // 基线模板作用域范围，如：["gray", "prod"]，不填时默认全局
    @NameInMap("scope")
    public java.util.List<String> scope;

    // 版本描述
    @NameInMap("description")
    public String description;

    public static AddSidecaropsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSidecaropsTemplateRequest self = new AddSidecaropsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddSidecaropsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSidecaropsTemplateRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public AddSidecaropsTemplateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AddSidecaropsTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddSidecaropsTemplateRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public AddSidecaropsTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
