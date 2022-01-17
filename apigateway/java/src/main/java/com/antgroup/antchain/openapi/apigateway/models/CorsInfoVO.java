// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CorsInfoVO extends TeaModel {
    // 是否允许发送COOKIE
    @NameInMap("allow_credentials")
    public Boolean allowCredentials;

    // 允许的 request headers
    @NameInMap("allow_headers")
    public java.util.List<String> allowHeaders;

    // 允许的http method
    @NameInMap("allow_methods")
    public java.util.List<String> allowMethods;

    // 允许的 ORIGIN
    @NameInMap("allow_origins")
    public java.util.List<String> allowOrigins;

    // API数量
    @NameInMap("api_count")
    public Long apiCount;

    // cors标识
    @NameInMap("cors_id")
    public String corsId;

    // cors名称
    @NameInMap("cors_name")
    public String corsName;

    // cors_scop
    @NameInMap("cors_scop")
    public String corsScop;

    // cors状态
    @NameInMap("cors_status")
    public String corsStatus;

    // 允许暴露的 reponse header
    @NameInMap("expose_headers")
    public java.util.List<String> exposeHeaders;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 预检请求的有效期
    @NameInMap("max_age")
    public Long maxAge;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static CorsInfoVO build(java.util.Map<String, ?> map) throws Exception {
        CorsInfoVO self = new CorsInfoVO();
        return TeaModel.build(map, self);
    }

    public CorsInfoVO setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }
    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    public CorsInfoVO setAllowHeaders(java.util.List<String> allowHeaders) {
        this.allowHeaders = allowHeaders;
        return this;
    }
    public java.util.List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    public CorsInfoVO setAllowMethods(java.util.List<String> allowMethods) {
        this.allowMethods = allowMethods;
        return this;
    }
    public java.util.List<String> getAllowMethods() {
        return this.allowMethods;
    }

    public CorsInfoVO setAllowOrigins(java.util.List<String> allowOrigins) {
        this.allowOrigins = allowOrigins;
        return this;
    }
    public java.util.List<String> getAllowOrigins() {
        return this.allowOrigins;
    }

    public CorsInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public CorsInfoVO setCorsId(String corsId) {
        this.corsId = corsId;
        return this;
    }
    public String getCorsId() {
        return this.corsId;
    }

    public CorsInfoVO setCorsName(String corsName) {
        this.corsName = corsName;
        return this;
    }
    public String getCorsName() {
        return this.corsName;
    }

    public CorsInfoVO setCorsScop(String corsScop) {
        this.corsScop = corsScop;
        return this;
    }
    public String getCorsScop() {
        return this.corsScop;
    }

    public CorsInfoVO setCorsStatus(String corsStatus) {
        this.corsStatus = corsStatus;
        return this;
    }
    public String getCorsStatus() {
        return this.corsStatus;
    }

    public CorsInfoVO setExposeHeaders(java.util.List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }
    public java.util.List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    public CorsInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CorsInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CorsInfoVO setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    public Long getMaxAge() {
        return this.maxAge;
    }

    public CorsInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CorsInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CorsInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
