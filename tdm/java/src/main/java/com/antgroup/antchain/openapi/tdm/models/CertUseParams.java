// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CertUseParams extends TeaModel {
    // 证明文件ID
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    public static CertUseParams build(java.util.Map<String, ?> map) throws Exception {
        CertUseParams self = new CertUseParams();
        return TeaModel.build(map, self);
    }

    public CertUseParams setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

}
