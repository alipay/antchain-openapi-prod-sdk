// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteDataauthorizationParticipantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与方ID
    @NameInMap("participant_id")
    @Validation(required = true)
    public String participantId;

    public static DeleteDataauthorizationParticipantRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataauthorizationParticipantRequest self = new DeleteDataauthorizationParticipantRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataauthorizationParticipantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDataauthorizationParticipantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDataauthorizationParticipantRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

}
