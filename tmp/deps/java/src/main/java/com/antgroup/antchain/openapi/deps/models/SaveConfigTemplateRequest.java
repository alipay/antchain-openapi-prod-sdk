// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SaveConfigTemplateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 描述
    @NameInMap("comment")
    public String comment;

    // 参数定义列表
    @NameInMap("params")
    public java.util.List<TemplateParamDef> params;

    // 参数模板 id
    @NameInMap("tpl_id")
    public String tplId;

    public static SaveConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigTemplateRequest self = new SaveConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SaveConfigTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveConfigTemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SaveConfigTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveConfigTemplateRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SaveConfigTemplateRequest setParams(java.util.List<TemplateParamDef> params) {
        this.params = params;
        return this;
    }
    public java.util.List<TemplateParamDef> getParams() {
        return this.params;
    }

    public SaveConfigTemplateRequest setTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }
    public String getTplId() {
        return this.tplId;
    }

}
