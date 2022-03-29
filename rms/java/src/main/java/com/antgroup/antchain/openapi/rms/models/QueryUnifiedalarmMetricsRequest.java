// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmMetricsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 告警规则唯一标识
    @NameInMap("rule_unique_identity")
    public String ruleUniqueIdentity;

    // metrics查询唯一id
    @NameInMap("muid")
    public String muid;

    // 维度筛选
    @NameInMap("tags")
    public java.util.List<KeySet> tags;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static QueryUnifiedalarmMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmMetricsRequest self = new QueryUnifiedalarmMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmMetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmMetricsRequest setRuleUniqueIdentity(String ruleUniqueIdentity) {
        this.ruleUniqueIdentity = ruleUniqueIdentity;
        return this;
    }
    public String getRuleUniqueIdentity() {
        return this.ruleUniqueIdentity;
    }

    public QueryUnifiedalarmMetricsRequest setMuid(String muid) {
        this.muid = muid;
        return this;
    }
    public String getMuid() {
        return this.muid;
    }

    public QueryUnifiedalarmMetricsRequest setTags(java.util.List<KeySet> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeySet> getTags() {
        return this.tags;
    }

    public QueryUnifiedalarmMetricsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryUnifiedalarmMetricsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryUnifiedalarmMetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
