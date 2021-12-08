// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateChainDataexportTaskRequest extends TeaModel {
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

    public static UpdateChainDataexportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainDataexportTaskRequest self = new UpdateChainDataexportTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChainDataexportTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChainDataexportTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChainDataexportTaskRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateChainDataexportTaskRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateChainDataexportTaskRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateChainDataexportTaskRequest setTrigger(TriggerDTOStructBody trigger) {
        this.trigger = trigger;
        return this;
    }
    public TriggerDTOStructBody getTrigger() {
        return this.trigger;
    }

}
