// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vc id，可通过该字符串来查询vc具体内容
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 验证者id
    @NameInMap("verifier_did")
    public String verifierDid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static QueryDidVcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidVcRequest self = new QueryDidVcRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidVcRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryDidVcRequest setVerifierDid(String verifierDid) {
        this.verifierDid = verifierDid;
        return this;
    }
    public String getVerifierDid() {
        return this.verifierDid;
    }

    public QueryDidVcRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
