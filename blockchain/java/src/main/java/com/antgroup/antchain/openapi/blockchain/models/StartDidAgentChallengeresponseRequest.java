// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidAgentChallengeresponseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 一段auth challenge明文，即需要被计算签名的明文
    @NameInMap("challenge_request")
    @Validation(required = true)
    public String challengeRequest;

    // 指定的did，该did必须是租户自己，或托管给租户的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 0 原始字符串，1 hash值
    @NameInMap("challenge_type")
    public Long challengeType;

    public static StartDidAgentChallengeresponseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidAgentChallengeresponseRequest self = new StartDidAgentChallengeresponseRequest();
        return TeaModel.build(map, self);
    }

    public StartDidAgentChallengeresponseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidAgentChallengeresponseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidAgentChallengeresponseRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidAgentChallengeresponseRequest setChallengeRequest(String challengeRequest) {
        this.challengeRequest = challengeRequest;
        return this;
    }
    public String getChallengeRequest() {
        return this.challengeRequest;
    }

    public StartDidAgentChallengeresponseRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidAgentChallengeresponseRequest setChallengeType(Long challengeType) {
        this.challengeType = challengeType;
        return this;
    }
    public Long getChallengeType() {
        return this.challengeType;
    }

}
