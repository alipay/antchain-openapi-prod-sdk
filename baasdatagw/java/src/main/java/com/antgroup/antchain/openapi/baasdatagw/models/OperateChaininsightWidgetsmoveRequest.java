// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OperateChaininsightWidgetsmoveRequest extends TeaModel {
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

    // 移动类型， 向上移动（MoveUp） / 向下移动（MoveDown）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static OperateChaininsightWidgetsmoveRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateChaininsightWidgetsmoveRequest self = new OperateChaininsightWidgetsmoveRequest();
        return TeaModel.build(map, self);
    }

    public OperateChaininsightWidgetsmoveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateChaininsightWidgetsmoveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateChaininsightWidgetsmoveRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public OperateChaininsightWidgetsmoveRequest setWidgetId(String widgetId) {
        this.widgetId = widgetId;
        return this;
    }
    public String getWidgetId() {
        return this.widgetId;
    }

    public OperateChaininsightWidgetsmoveRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OperateChaininsightWidgetsmoveRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
