// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryJdFunddividerelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被分账方商户公司社会统一信用代码
    @NameInMap("subject_merchant_id")
    @Validation(required = true)
    public String subjectMerchantId;

    // 分账关系id
    @NameInMap("relation_id")
    @Validation(required = true)
    public String relationId;

    public static QueryJdFunddividerelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJdFunddividerelationRequest self = new QueryJdFunddividerelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryJdFunddividerelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJdFunddividerelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJdFunddividerelationRequest setSubjectMerchantId(String subjectMerchantId) {
        this.subjectMerchantId = subjectMerchantId;
        return this;
    }
    public String getSubjectMerchantId() {
        return this.subjectMerchantId;
    }

    public QueryJdFunddividerelationRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

}
