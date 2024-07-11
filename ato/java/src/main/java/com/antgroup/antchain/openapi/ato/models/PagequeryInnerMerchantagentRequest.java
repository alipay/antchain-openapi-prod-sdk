// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerMerchantagentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 代理商户名称
    @NameInMap("agent_name")
    public String agentName;

    // 进件状态
    @NameInMap("pay_expand_status")
    public String payExpandStatus;

    // 分页对象
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryInnerMerchantagentRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerMerchantagentRequest self = new PagequeryInnerMerchantagentRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerMerchantagentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerMerchantagentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerMerchantagentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerMerchantagentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public PagequeryInnerMerchantagentRequest setPayExpandStatus(String payExpandStatus) {
        this.payExpandStatus = payExpandStatus;
        return this;
    }
    public String getPayExpandStatus() {
        return this.payExpandStatus;
    }

    public PagequeryInnerMerchantagentRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
