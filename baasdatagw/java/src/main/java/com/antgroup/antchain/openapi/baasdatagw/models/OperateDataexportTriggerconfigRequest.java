// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OperateDataexportTriggerconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // -
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // -
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 导出任务ID
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // -
    @NameInMap("trigger")
    @Validation(required = true)
    public Trigger trigger;

    public static OperateDataexportTriggerconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDataexportTriggerconfigRequest self = new OperateDataexportTriggerconfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateDataexportTriggerconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateDataexportTriggerconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateDataexportTriggerconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateDataexportTriggerconfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateDataexportTriggerconfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OperateDataexportTriggerconfigRequest setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public Trigger getTrigger() {
        return this.trigger;
    }

}
