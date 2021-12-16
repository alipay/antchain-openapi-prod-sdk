// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PagequeryPartnercorePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 政策名称（字段保留） 不做调用
    @NameInMap("policy_name")
    public String policyName;

    // 政策状态（字段保留） 不做调用
    @NameInMap("policy_status")
    public String policyStatus;

    // 签约状态 SIGNED已签约 UNSIGNED 待签约
    @NameInMap("sign_status")
    public String signStatus;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页记录数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryPartnercorePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryPartnercorePolicyRequest self = new PagequeryPartnercorePolicyRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryPartnercorePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryPartnercorePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public PagequeryPartnercorePolicyRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public PagequeryPartnercorePolicyRequest setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public PagequeryPartnercorePolicyRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryPartnercorePolicyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
