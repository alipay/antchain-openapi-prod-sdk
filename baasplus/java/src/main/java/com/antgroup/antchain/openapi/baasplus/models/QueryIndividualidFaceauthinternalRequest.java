// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidFaceauthinternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 认证的唯一性id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static QueryIndividualidFaceauthinternalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidFaceauthinternalRequest self = new QueryIndividualidFaceauthinternalRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidFaceauthinternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndividualidFaceauthinternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndividualidFaceauthinternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryIndividualidFaceauthinternalRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
