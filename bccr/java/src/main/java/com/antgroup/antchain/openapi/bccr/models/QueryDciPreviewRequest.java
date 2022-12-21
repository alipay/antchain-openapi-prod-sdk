// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciPreviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci作品预览id
    @NameInMap("dci_preview_id")
    public String dciPreviewId;

    // basis的dci content id
    @NameInMap("dci_basis_id")
    public String dciBasisId;

    public static QueryDciPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciPreviewRequest self = new QueryDciPreviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciPreviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciPreviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciPreviewRequest setDciPreviewId(String dciPreviewId) {
        this.dciPreviewId = dciPreviewId;
        return this;
    }
    public String getDciPreviewId() {
        return this.dciPreviewId;
    }

    public QueryDciPreviewRequest setDciBasisId(String dciBasisId) {
        this.dciBasisId = dciBasisId;
        return this;
    }
    public String getDciBasisId() {
        return this.dciBasisId;
    }

}
