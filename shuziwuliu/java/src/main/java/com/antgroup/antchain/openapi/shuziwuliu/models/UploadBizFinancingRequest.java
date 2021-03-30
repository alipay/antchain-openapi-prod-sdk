// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadBizFinancingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资数据
    @NameInMap("financing_data")
    @Validation(required = true)
    public java.util.List<UploadFinancingParam> financingData;

    public static UploadBizFinancingRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBizFinancingRequest self = new UploadBizFinancingRequest();
        return TeaModel.build(map, self);
    }

    public UploadBizFinancingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadBizFinancingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadBizFinancingRequest setFinancingData(java.util.List<UploadFinancingParam> financingData) {
        this.financingData = financingData;
        return this;
    }
    public java.util.List<UploadFinancingParam> getFinancingData() {
        return this.financingData;
    }

}
