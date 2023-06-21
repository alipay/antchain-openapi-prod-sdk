// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryCertifyrecordChargeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待查询的certify_id列表
    @NameInMap("certify_id_list")
    @Validation(required = true)
    public java.util.List<String> certifyIdList;

    public static QueryCertifyrecordChargeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCertifyrecordChargeRequest self = new QueryCertifyrecordChargeRequest();
        return TeaModel.build(map, self);
    }

    public QueryCertifyrecordChargeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCertifyrecordChargeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCertifyrecordChargeRequest setCertifyIdList(java.util.List<String> certifyIdList) {
        this.certifyIdList = certifyIdList;
        return this;
    }
    public java.util.List<String> getCertifyIdList() {
        return this.certifyIdList;
    }

}
