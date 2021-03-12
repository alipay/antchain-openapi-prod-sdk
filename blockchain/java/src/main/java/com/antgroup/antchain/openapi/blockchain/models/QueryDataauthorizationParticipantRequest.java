// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDataauthorizationParticipantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与方ID
    @NameInMap("participant_id")
    @Validation(required = true, maxLength = 100)
    public String participantId;

    public static QueryDataauthorizationParticipantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataauthorizationParticipantRequest self = new QueryDataauthorizationParticipantRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataauthorizationParticipantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataauthorizationParticipantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataauthorizationParticipantRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

}
