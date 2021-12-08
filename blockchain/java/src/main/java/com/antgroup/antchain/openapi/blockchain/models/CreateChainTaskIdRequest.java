// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainTaskIdRequest extends TeaModel {
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

    // TriggerDTO结构体
    @NameInMap("trigger")
    @Validation(required = true)
    public TriggerDTOStructBody trigger;

    public static CreateChainTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainTaskIdRequest self = new CreateChainTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainTaskIdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainTaskIdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainTaskIdRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateChainTaskIdRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateChainTaskIdRequest setTrigger(TriggerDTOStructBody trigger) {
        this.trigger = trigger;
        return this;
    }
    public TriggerDTOStructBody getTrigger() {
        return this.trigger;
    }

}
