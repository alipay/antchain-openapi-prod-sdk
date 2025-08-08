// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ScpTicketIssueData extends TeaModel {
    // 凭证对应的司机/货主的did
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 	
    // 凭证id
    /**
     * <strong>example:</strong>
     * <p>11111111</p>
     */
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    public static ScpTicketIssueData build(java.util.Map<String, ?> map) throws Exception {
        ScpTicketIssueData self = new ScpTicketIssueData();
        return TeaModel.build(map, self);
    }

    public ScpTicketIssueData setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ScpTicketIssueData setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

}
