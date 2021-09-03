// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class QuerySlxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 修复批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // Sha256 加密后的身 份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    public static QuerySlxfRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlxfRequest self = new QuerySlxfRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySlxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySlxfRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QuerySlxfRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

}
