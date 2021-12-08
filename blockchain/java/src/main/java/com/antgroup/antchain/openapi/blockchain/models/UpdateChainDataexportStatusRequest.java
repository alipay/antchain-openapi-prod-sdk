// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateChainDataexportStatusRequest extends TeaModel {
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

    // "9481b612d6ca4cfdbecc5c5d395eda423f007745-233d-4860-8fd4-a107233ace6c"
    @NameInMap("trigger_name")
    @Validation(required = true)
    public String triggerName;

    //  "Enabled/Disabled/DELETE"
    @NameInMap("status_action")
    @Validation(required = true)
    public String statusAction;

    public static UpdateChainDataexportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainDataexportStatusRequest self = new UpdateChainDataexportStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChainDataexportStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChainDataexportStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChainDataexportStatusRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateChainDataexportStatusRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateChainDataexportStatusRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateChainDataexportStatusRequest setStatusAction(String statusAction) {
        this.statusAction = statusAction;
        return this;
    }
    public String getStatusAction() {
        return this.statusAction;
    }

}
