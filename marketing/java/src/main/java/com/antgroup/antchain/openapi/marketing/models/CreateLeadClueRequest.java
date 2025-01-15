// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class CreateLeadClueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 补登线索,客户信息
    @NameInMap("request")
    @Validation(required = true)
    public ClueInformationReq request;

    // 线索来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 企业名称
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
    // tenant+source+customerName唯一确定一条线索。
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    public static CreateLeadClueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeadClueRequest self = new CreateLeadClueRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeadClueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeadClueRequest setRequest(ClueInformationReq request) {
        this.request = request;
        return this;
    }
    public ClueInformationReq getRequest() {
        return this.request;
    }

    public CreateLeadClueRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateLeadClueRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CreateLeadClueRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
