// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class CancelExpenditureProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户来源-用于租户间功能和数据的隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public Long projectId;

    public static CancelExpenditureProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelExpenditureProjectRequest self = new CancelExpenditureProjectRequest();
        return TeaModel.build(map, self);
    }

    public CancelExpenditureProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelExpenditureProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CancelExpenditureProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
