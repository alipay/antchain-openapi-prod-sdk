// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidDiddocDirectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 待查询did
    @NameInMap("query_did")
    @Validation(required = true)
    public String queryDid;

    // 请求中其他字段的签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static QueryDidDiddocDirectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidDiddocDirectRequest self = new QueryDidDiddocDirectRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidDiddocDirectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidDiddocDirectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidDiddocDirectRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryDidDiddocDirectRequest setQueryDid(String queryDid) {
        this.queryDid = queryDid;
        return this;
    }
    public String getQueryDid() {
        return this.queryDid;
    }

    public QueryDidDiddocDirectRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public QueryDidDiddocDirectRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
