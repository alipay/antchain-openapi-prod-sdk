// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class CreateBaasChainDataexportTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // {}
    @NameInMap("trigger")
    @Validation(required = true)
    public TriggerDTOStructBody trigger;

    public static CreateBaasChainDataexportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasChainDataexportTaskRequest self = new CreateBaasChainDataexportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasChainDataexportTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasChainDataexportTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasChainDataexportTaskRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateBaasChainDataexportTaskRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateBaasChainDataexportTaskRequest setTrigger(TriggerDTOStructBody trigger) {
        this.trigger = trigger;
        return this;
    }
    public TriggerDTOStructBody getTrigger() {
        return this.trigger;
    }

}
