// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationAvailableDatamodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与方DID
    @NameInMap("participant_id")
    @Validation(required = true)
    public String participantId;

    public static ListDataauthorizationAvailableDatamodelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationAvailableDatamodelRequest self = new ListDataauthorizationAvailableDatamodelRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationAvailableDatamodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationAvailableDatamodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationAvailableDatamodelRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

}
