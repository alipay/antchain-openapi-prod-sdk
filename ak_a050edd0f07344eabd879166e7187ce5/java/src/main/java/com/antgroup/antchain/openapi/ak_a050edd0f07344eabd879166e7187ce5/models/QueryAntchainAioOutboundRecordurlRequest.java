// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class QueryAntchainAioOutboundRecordurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tnt_inst_id")
    @Validation(required = true)
    public String tntInstId;

    // 业务code
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // acid
    @NameInMap("acid")
    public String acid;

    // callRequestId
    @NameInMap("call_request_id")
    public String callRequestId;

    public static QueryAntchainAioOutboundRecordurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAioOutboundRecordurlRequest self = new QueryAntchainAioOutboundRecordurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAioOutboundRecordurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAioOutboundRecordurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAioOutboundRecordurlRequest setTntInstId(String tntInstId) {
        this.tntInstId = tntInstId;
        return this;
    }
    public String getTntInstId() {
        return this.tntInstId;
    }

    public QueryAntchainAioOutboundRecordurlRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryAntchainAioOutboundRecordurlRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public QueryAntchainAioOutboundRecordurlRequest setCallRequestId(String callRequestId) {
        this.callRequestId = callRequestId;
        return this;
    }
    public String getCallRequestId() {
        return this.callRequestId;
    }

}
