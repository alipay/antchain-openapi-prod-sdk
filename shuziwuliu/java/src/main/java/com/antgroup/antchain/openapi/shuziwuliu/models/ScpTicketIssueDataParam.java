// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ScpTicketIssueDataParam extends TeaModel {
    // 凭证id
    /**
     * <strong>example:</strong>
     * <p>12345566</p>
     */
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 凭证对应的司机/货主的did
    /**
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static ScpTicketIssueDataParam build(java.util.Map<String, ?> map) throws Exception {
        ScpTicketIssueDataParam self = new ScpTicketIssueDataParam();
        return TeaModel.build(map, self);
    }

    public ScpTicketIssueDataParam setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public ScpTicketIssueDataParam setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
