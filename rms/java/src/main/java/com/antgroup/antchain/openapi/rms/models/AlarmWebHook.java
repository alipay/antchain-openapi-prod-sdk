// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmWebHook extends TeaModel {
    // 主键 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // url
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // method (POST, GET等)
    @NameInMap("method")
    @Validation(required = true)
    public String method;

    // headers
    @NameInMap("headers")
    public java.util.List<KeySet> headers;

    // params
    @NameInMap("params")
    public java.util.List<KeySet> params;

    // config
    @NameInMap("config")
    public java.util.List<KeySet> config;

    // body_template
    @NameInMap("body_template")
    public String bodyTemplate;

    // 是否该 scope 内全局
    @NameInMap("scope_global")
    public Boolean scopeGlobal;

    // creator
    @NameInMap("creator")
    public String creator;

    // modifier
    @NameInMap("modifier")
    public String modifier;

    // gmtCreate
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // gmtModified
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // webhook订阅的规则数量
    @NameInMap("subscribe_count")
    public Long subscribeCount;

    // 当前租户有效还是当前workspace有效
    @NameInMap("valid_scope")
    public Long validScope;

    public static AlarmWebHook build(java.util.Map<String, ?> map) throws Exception {
        AlarmWebHook self = new AlarmWebHook();
        return TeaModel.build(map, self);
    }

    public AlarmWebHook setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlarmWebHook setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlarmWebHook setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public AlarmWebHook setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public AlarmWebHook setHeaders(java.util.List<KeySet> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<KeySet> getHeaders() {
        return this.headers;
    }

    public AlarmWebHook setParams(java.util.List<KeySet> params) {
        this.params = params;
        return this;
    }
    public java.util.List<KeySet> getParams() {
        return this.params;
    }

    public AlarmWebHook setConfig(java.util.List<KeySet> config) {
        this.config = config;
        return this;
    }
    public java.util.List<KeySet> getConfig() {
        return this.config;
    }

    public AlarmWebHook setBodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }
    public String getBodyTemplate() {
        return this.bodyTemplate;
    }

    public AlarmWebHook setScopeGlobal(Boolean scopeGlobal) {
        this.scopeGlobal = scopeGlobal;
        return this;
    }
    public Boolean getScopeGlobal() {
        return this.scopeGlobal;
    }

    public AlarmWebHook setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public AlarmWebHook setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public AlarmWebHook setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AlarmWebHook setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AlarmWebHook setSubscribeCount(Long subscribeCount) {
        this.subscribeCount = subscribeCount;
        return this;
    }
    public Long getSubscribeCount() {
        return this.subscribeCount;
    }

    public AlarmWebHook setValidScope(Long validScope) {
        this.validScope = validScope;
        return this;
    }
    public Long getValidScope() {
        return this.validScope;
    }

}
