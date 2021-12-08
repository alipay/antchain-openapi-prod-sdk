// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainTableSqlRequest extends TeaModel {
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

    public static CreateChainTableSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainTableSqlRequest self = new CreateChainTableSqlRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainTableSqlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainTableSqlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainTableSqlRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateChainTableSqlRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateChainTableSqlRequest setTrigger(TriggerDTOStructBody trigger) {
        this.trigger = trigger;
        return this;
    }
    public TriggerDTOStructBody getTrigger() {
        return this.trigger;
    }

}
