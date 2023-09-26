// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DeleteChaininsightWidgetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 看板ID
    @NameInMap("widget_id")
    @Validation(required = true)
    public String widgetId;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static DeleteChaininsightWidgetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChaininsightWidgetsRequest self = new DeleteChaininsightWidgetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChaininsightWidgetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteChaininsightWidgetsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteChaininsightWidgetsRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public DeleteChaininsightWidgetsRequest setWidgetId(String widgetId) {
        this.widgetId = widgetId;
        return this;
    }
    public String getWidgetId() {
        return this.widgetId;
    }

    public DeleteChaininsightWidgetsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
