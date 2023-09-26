// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class AddChaininsightWidgetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    // 数据洞察看板
    @NameInMap("widget")
    @Validation(required = true)
    public ChainInsightWidget widget;

    public static AddChaininsightWidgetsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChaininsightWidgetsRequest self = new AddChaininsightWidgetsRequest();
        return TeaModel.build(map, self);
    }

    public AddChaininsightWidgetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddChaininsightWidgetsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddChaininsightWidgetsRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public AddChaininsightWidgetsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddChaininsightWidgetsRequest setWidget(ChainInsightWidget widget) {
        this.widget = widget;
        return this;
    }
    public ChainInsightWidget getWidget() {
        return this.widget;
    }

}
