// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class LoadConnectorjobSloviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // source类型
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 触发类型
    @NameInMap("trigger_type")
    @Validation(required = true)
    public String triggerType;

    // cron表达式的值
    @NameInMap("trigger_value")
    @Validation(required = true)
    public String triggerValue;

    public static LoadConnectorjobSloviewRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadConnectorjobSloviewRequest self = new LoadConnectorjobSloviewRequest();
        return TeaModel.build(map, self);
    }

    public LoadConnectorjobSloviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadConnectorjobSloviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoadConnectorjobSloviewRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public LoadConnectorjobSloviewRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public LoadConnectorjobSloviewRequest setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
        return this;
    }
    public String getTriggerValue() {
        return this.triggerValue;
    }

}
