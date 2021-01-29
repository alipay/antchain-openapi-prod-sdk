// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("application_name")
    public String applicationName;

    // 应用分组名
    @NameInMap("app_group_name")
    public String appGroupName;

    // 应用级别
    @NameInMap("app_level_name")
    public String appLevelName;

    // 登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Long pageSize;

    // 查询结果是否返回应用额外元数据信息。此字段为 true 时，为保证查询效率，列表大小将强制修改为 10 （若超过）
    @NameInMap("query_extra_info")
    public Boolean queryExtraInfo;

    public static QueryApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationRequest self = new QueryApplicationRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public QueryApplicationRequest setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public QueryApplicationRequest setAppLevelName(String appLevelName) {
        this.appLevelName = appLevelName;
        return this;
    }
    public String getAppLevelName() {
        return this.appLevelName;
    }

    public QueryApplicationRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public QueryApplicationRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationRequest setQueryExtraInfo(Boolean queryExtraInfo) {
        this.queryExtraInfo = queryExtraInfo;
        return this;
    }
    public Boolean getQueryExtraInfo() {
        return this.queryExtraInfo;
    }

}
