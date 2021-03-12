// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckDataauthorizationAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权限凭证
    @NameInMap("authority_cert")
    @Validation(required = true)
    public String authorityCert;

    // 数据ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 参与方ID
    @NameInMap("participant_id")
    @Validation(required = true)
    public String participantId;

    public static CheckDataauthorizationAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataauthorizationAuthorizationRequest self = new CheckDataauthorizationAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataauthorizationAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckDataauthorizationAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckDataauthorizationAuthorizationRequest setAuthorityCert(String authorityCert) {
        this.authorityCert = authorityCert;
        return this;
    }
    public String getAuthorityCert() {
        return this.authorityCert;
    }

    public CheckDataauthorizationAuthorizationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CheckDataauthorizationAuthorizationRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

}
