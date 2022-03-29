// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AgentVersionStrategy extends TeaModel {
    // agent 地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // agent 版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 0 容器，1经典
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 0 生效，1失效
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // agent 版本内容
    @NameInMap("content")
    public String content;

    // 生效范围
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 生效范围的唯一标识
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    public static AgentVersionStrategy build(java.util.Map<String, ?> map) throws Exception {
        AgentVersionStrategy self = new AgentVersionStrategy();
        return TeaModel.build(map, self);
    }

    public AgentVersionStrategy setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public AgentVersionStrategy setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AgentVersionStrategy setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public AgentVersionStrategy setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AgentVersionStrategy setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AgentVersionStrategy setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AgentVersionStrategy setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public AgentVersionStrategy setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AgentVersionStrategy setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
