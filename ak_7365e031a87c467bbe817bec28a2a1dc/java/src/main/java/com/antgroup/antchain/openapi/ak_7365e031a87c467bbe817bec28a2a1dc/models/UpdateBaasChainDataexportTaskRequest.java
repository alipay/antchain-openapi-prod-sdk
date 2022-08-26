// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class UpdateBaasChainDataexportTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // 链id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // 任务名称
    @NameInMap("trigger_name")
    @Validation(required = true)
    public String triggerName;

    // 导出任务接口体
    @NameInMap("trigger")
    @Validation(required = true)
    public TriggerDTOStructBody trigger;

    public static UpdateBaasChainDataexportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasChainDataexportTaskRequest self = new UpdateBaasChainDataexportTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasChainDataexportTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasChainDataexportTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasChainDataexportTaskRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateBaasChainDataexportTaskRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateBaasChainDataexportTaskRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateBaasChainDataexportTaskRequest setTrigger(TriggerDTOStructBody trigger) {
        this.trigger = trigger;
        return this;
    }
    public TriggerDTOStructBody getTrigger() {
        return this.trigger;
    }

}
