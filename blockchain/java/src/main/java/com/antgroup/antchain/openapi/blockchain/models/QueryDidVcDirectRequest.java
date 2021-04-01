// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidVcDirectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 请求中其他字段的签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 可验证声明id
    @NameInMap("vcid")
    @Validation(required = true)
    public String vcid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static QueryDidVcDirectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidVcDirectRequest self = new QueryDidVcDirectRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidVcDirectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidVcDirectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidVcDirectRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryDidVcDirectRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public QueryDidVcDirectRequest setVcid(String vcid) {
        this.vcid = vcid;
        return this;
    }
    public String getVcid() {
        return this.vcid;
    }

    public QueryDidVcDirectRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
