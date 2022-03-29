// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmwebhookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // createOrModifyByMe
    @NameInMap("create_or_modify_by_me")
    @Validation(required = true)
    public Boolean createOrModifyByMe;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // webhook名称
    @NameInMap("name")
    public String name;

    // 修改人
    @NameInMap("modifier")
    public String modifier;

    // ID列表
    @NameInMap("ids")
    public java.util.List<Long> ids;

    // 是否只查询当前操作者的
    @NameInMap("only_current_staff")
    public Boolean onlyCurrentStaff;

    public static QueryAlarmwebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmwebhookRequest self = new QueryAlarmwebhookRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmwebhookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmwebhookRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAlarmwebhookRequest setCreateOrModifyByMe(Boolean createOrModifyByMe) {
        this.createOrModifyByMe = createOrModifyByMe;
        return this;
    }
    public Boolean getCreateOrModifyByMe() {
        return this.createOrModifyByMe;
    }

    public QueryAlarmwebhookRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmwebhookRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlarmwebhookRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAlarmwebhookRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public QueryAlarmwebhookRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public QueryAlarmwebhookRequest setOnlyCurrentStaff(Boolean onlyCurrentStaff) {
        this.onlyCurrentStaff = onlyCurrentStaff;
        return this;
    }
    public Boolean getOnlyCurrentStaff() {
        return this.onlyCurrentStaff;
    }

}
