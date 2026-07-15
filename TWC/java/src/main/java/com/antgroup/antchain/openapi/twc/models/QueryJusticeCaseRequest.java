// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeCaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件Id,创建案件返回的id
    @NameInMap("case_id")
    @Validation(required = true)
    public Long caseId;

    // 维权记录ID, 维权成功后,返回的对应的维权记录ID
    @NameInMap("record_id")
    public Long recordId;

    public static QueryJusticeCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeCaseRequest self = new QueryJusticeCaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryJusticeCaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJusticeCaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJusticeCaseRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryJusticeCaseRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
