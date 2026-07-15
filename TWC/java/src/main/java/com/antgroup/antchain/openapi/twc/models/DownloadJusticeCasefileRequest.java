// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DownloadJusticeCasefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件id
    @NameInMap("case_id")
    @Validation(required = true)
    public String caseId;

    // 维权记录id
    @NameInMap("record_id")
    @Validation(required = true)
    public String recordId;

    public static DownloadJusticeCasefileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadJusticeCasefileRequest self = new DownloadJusticeCasefileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadJusticeCasefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadJusticeCasefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadJusticeCasefileRequest setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public DownloadJusticeCasefileRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
