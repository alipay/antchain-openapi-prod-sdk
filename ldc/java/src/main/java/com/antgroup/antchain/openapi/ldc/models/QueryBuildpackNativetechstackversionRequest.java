// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryBuildpackNativetechstackversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 技术栈名称。
    // 原则上允许用户定义同名自定义技术栈（e.g,用户创建和全局同名的技术栈SOFA），此时优先获取用户自定义技术栈下技术栈版本；
    @NameInMap("tech_stack")
    @Validation(required = true)
    public String techStack;

    // 当前页码， 默认值为1
    @NameInMap("current_page")
    public Long currentPage;

    // 一页获取个数，默认值10
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryBuildpackNativetechstackversionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackNativetechstackversionRequest self = new QueryBuildpackNativetechstackversionRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackNativetechstackversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackNativetechstackversionRequest setTechStack(String techStack) {
        this.techStack = techStack;
        return this;
    }
    public String getTechStack() {
        return this.techStack;
    }

    public QueryBuildpackNativetechstackversionRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpackNativetechstackversionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
