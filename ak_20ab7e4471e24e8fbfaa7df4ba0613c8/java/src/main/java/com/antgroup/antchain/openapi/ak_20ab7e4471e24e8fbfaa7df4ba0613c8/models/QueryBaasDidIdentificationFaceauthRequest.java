// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class QueryBaasDidIdentificationFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证ID，用于查询认证结果
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // vc id，可通过该字符串来查询vc具体内容
    @NameInMap("vc_id")
    public String vcId;

    public static QueryBaasDidIdentificationFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasDidIdentificationFaceauthRequest self = new QueryBaasDidIdentificationFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasDidIdentificationFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasDidIdentificationFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasDidIdentificationFaceauthRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryBaasDidIdentificationFaceauthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryBaasDidIdentificationFaceauthRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
