// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ConfirmExpenditureProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public Long projectId;

    // 客户确认时间
    @NameInMap("confirm_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String confirmTime;

    public static ConfirmExpenditureProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmExpenditureProjectRequest self = new ConfirmExpenditureProjectRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmExpenditureProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmExpenditureProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ConfirmExpenditureProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ConfirmExpenditureProjectRequest setConfirmTime(String confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public String getConfirmTime() {
        return this.confirmTime;
    }

}
